package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import views.html.*;
import models.*;


public class Themes extends Controller {

    public static Result index(Long forumId) {
    	
    	Forum forum = Forum.find.byId(forumId);
    	List<Theme> themes = Theme.findByForumId(forumId);
        return ok(views.html.Themes.index.render(forum, themes));
    }


    public static Result save() {
    	  flash("success", "The item has been created");
    	  return redirect("/");
    }
    

    public static Result insert(Long forumId) {
    	return TODO;
    }
    
    
    public static Result insertValidate(Long forumId) {
    	return TODO;
    }


}