package controllers;

import java.util.*;

import play.*;
import play.mvc.*;

import views.html.*;

import models.*;

public class Messages extends Controller {

    public static Result index(Long forumId, Long themeId) {
    	
    	Forum forum = Forum.find.byId(forumId);
    	Theme theme = Theme.find.byId(themeId);
    	List<Message> messages = Message.findByThemeId(themeId);
    	
        return ok(views.html.Messages.index.render(forum, theme, messages));
    }


    public static Result save() {
    	  flash("success", "The item has been created");
    	  return redirect("/");
    }

}