package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import views.html.*;
import models.*;
import play.data.Form;


public class Themes extends Controller {

    public static Result index(Long forumId) {
    	User.find.setAutofetch(true);
    	Forum forum = Forum.find.byId(forumId);
    	List<Theme> themes = Theme.findByForumId(forumId);
        return ok(views.html.Themes.index.render(forum, themes));
    }


    public static Result save() {
    	  flash("success", "The item has been created");
    	  return TODO;
    }
    

    public static Result insert(Long forumId) {
    	return TODO;
    }
    
    
    public static Result insertValidate() {
    	
    	Form<forms.Theme> themeForm = Form.form(forms.Theme.class).bindFromRequest("form_id, form_name, name");
//    	
    	if (themeForm.hasErrors()) {
    		
    		return badRequest(views.html.Themes.insert.render(themeForm));
    	}
    	else {
    		models.Theme theme = new models.Theme();
            theme.name = themeForm.field("name").value();
            theme.forum = models.Forum.find.byId(Long.valueOf(themeForm.field("forum_id").value()));
            theme.user = User.findByEmail(session().get("userEmail"));
            theme.creationDate = new Date();
            theme.save();
    		
    		flash("alert", "The new theme has sussefully added");
    		return redirect(routes.Themes.index(Long.valueOf(themeForm.field("forum_id").value())));
    	}
    	
    	
    }

}