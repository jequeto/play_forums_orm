package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import views.html.*;
import models.*;
import play.data.Form;
import play.data.Form.*;

import forms.ThemeInsert;


public class Themes extends Controller {

	
	
    public static Result index(Long forumId) {
    	
    	Forum forum = Forum.find.byId(forumId);
    	if (forum == null) {
    		return badRequest(views.html.notFoundPage.render(""));
    	}
    	else {
    		List<Theme> themes = Theme.findByForumId(forumId);
    	   	Form<ThemeInsert> formInsert = Form.form(ThemeInsert.class);
            return ok(views.html.Themes.index.render(forum, themes, formInsert));
    	}
    }


    public static Result insert(Long forumId) {
    	return TODO;
    }
    
    public static Result insertValidate(Long forumId) {
    	
    	Form<ThemeInsert> themeForm = Form.form(ThemeInsert.class).bindFromRequest();
//    	
    	if (themeForm.hasErrors()) {
    		
    		return badRequest(views.html.Themes.insert.render(themeForm));
    	}
    	else {
    		models.Theme theme = new models.Theme();
            theme.name = themeForm.field("name").value();
            theme.forum = models.Forum.find.byId(Long.valueOf(themeForm.field("forum_id").value()));
            theme.creatorUser = User.findByEmail(session().get("userEmail"));
            theme.creationDate = new Date();
            theme.save();
    		
    		flash("alert", "The new theme has sussefully added");
    		return redirect(routes.Themes.index(Long.valueOf(themeForm.field("forum_id").value())));
    	}
    	
    }
    
    
    public static Result update(Long forumId, Long themeId) {
    	
    	Theme theme = Theme.find.fetch("forum").where().eq("id", themeId).findUnique();
    	Map<String,String> data = new HashMap();
    	data.put("id", Long.toString(theme.id));
    	data.put("forum_id", Long.toString(theme.forum.id));
    	data.put("forum_name", theme.forum.name);
    	data.put("name", theme.name);
    	
    	Form<forms.ThemeUpdate> formUpdate = Form.form(forms.ThemeUpdate.class).bind(data);
//    	return ok(formUpdate.toString());
    	return ok(views.html.Themes.update.render(formUpdate));
    	
    }
    
    
    public static Result updateValidate(Long forumId, Long themeId) {
    	
    	return TODO;
    	
    }
    
    
    public static Result delete(Long forumId, Long themeId) {
    	
    	return TODO;
    	
    }
    
    
    public static Result deleteValidate(Long forumId, Long themeId) {
    	
    	return TODO;
    	
    }

}