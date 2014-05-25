package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import views.html.*;
import models.*;
import play.data.Form;
import play.data.Form.*;

import forms.ThemeInsert;
import forms.ThemeUpdate;
import forms.ThemeBase;


public class Themes extends Controller {

	
	
    public static Result index(Long forumId) {
    	
    	Forum forum = Forum.find.byId(forumId);
    	if (forum == null) {
    		return badRequest(views.html.notFoundPage.render(""));
    	}
    	else {
    		List<Theme> themes = Theme.findByForumId(forumId);
    	   	Form<forms.ThemeInsert> formTheme = Form.form(forms.ThemeInsert.class);
            return ok(views.html.Themes.index.render(forum, themes, formTheme));
    	}
    }


    public static Result insert(Long forumId) {
    	
    	return TODO;
    	
    }
    
    
    public static Result insertValidate(Long forumId) {
    	
    	Form<forms.ThemeInsert> themeForm = Form.form(forms.ThemeInsert.class).bindFromRequest();
  	
    	if (themeForm.hasErrors()) {
    		return badRequest(views.html.Themes.insert.render(themeForm));
    	}
    	else {
    		models.Theme theme = new models.Theme();
            theme.setName(themeForm.field("name").value());
            theme.setForum(models.Forum.find.byId(Long.valueOf(themeForm.field("forum_id").value())));
            theme.setCreatorUser(User.findByEmail(session().get("userEmail")));
            theme.setCreationDate(new Date());
            theme.save();
    		
    		flash("alert", "The new theme has sussefully been added");
    		return redirect(routes.Themes.index(Long.valueOf(themeForm.field("forum_id").value())));
    	}
    
    }
    
    
    public static Result update(Long themeId) {
    	
    	Theme theme = Theme.find.fetch("forum").where().eq("id", themeId).findUnique();
    	Map<String,String> data = new HashMap();
    	data.put("id", Long.toString(theme.id));
    	data.put("name", theme.name);
    	data.put("forum_id", Long.toString(theme.forum.id));
    	data.put("forum_name", theme.forum.name);
    	
    	Form<forms.ThemeUpdate> formTheme = Form.form(forms.ThemeUpdate.class).bind(data);
    	return ok(views.html.Themes.update.render(formTheme));
    	
    }
    
    
    public static Result updateValidate(Long themeId) {
    	
    	Form<forms.ThemeUpdate> formTheme = Form.form(forms.ThemeUpdate.class).bindFromRequest();
    	
    	if (formTheme.hasErrors()) {
    		Theme theme = Theme.find.fetch("forum").where().eq("id", Long.valueOf( formTheme.field("id").value() )).findUnique();
    		if (theme != null) {
    			return badRequest(views.html.Themes.update.render(formTheme));
    		}
    		else {
    			return badRequest(views.html.noFoundPage.render(""));
    		}
    	}
    	else {
    		models.Theme theme = models.Theme.find.byId(Long.valueOf( formTheme.field("id").value() ) );
    		theme.setName(formTheme.field("name").value());
    		theme.update();
    		flash("alert", "The theme has sussefully been modified");
    		return redirect(routes.Themes.index(Long.valueOf(formTheme.field("forum_id").value())));
    	}
    	
    }
    
    
    public static Result delete(Long themeId) {
    	
    	Theme theme = Theme.find.fetch("forum").where().eq("id", themeId).findUnique();
    	Map<String,String> data = new HashMap();
    	data.put("id", Long.toString(theme.id));
    	data.put("name", theme.name);
    	data.put("forum_id", Long.toString(theme.forum.id));
    	data.put("forum_name", theme.forum.name);
    	
    	Form<forms.ThemeBase> formTheme = Form.form(forms.ThemeBase.class).bind(data);
    	return ok(views.html.Themes.delete.render(formTheme));
    	
    }
    
    
    public static Result deleteValidate(Long themeId) {
    	
    	Form<forms.ThemeBase> formTheme = Form.form(forms.ThemeBase.class).bindFromRequest();
    	
    	if (formTheme.hasErrors()) {
    		return badRequest(views.html.Themes.delete.render(formTheme));
    	}
    	else {
    		models.Theme theme = models.Theme.find.byId(Long.valueOf( formTheme.field("id").value() ) );
    		if (theme == null) {
    			return badRequest(views.html.noFoundPage.render(""));
    		}

    		theme.delete();
    		flash("alert", "The theme has sussefully been deleted");
    		return redirect(routes.Themes.index(Long.valueOf(formTheme.field("forum_id").value())));
    	}
    }

}