package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import views.html.*;
import models.*;

public class Forums extends Controller {

    public static Result index() {
    	
    	models.Forum forum = new models.Forum();
    	forum.name = "Forum 1";
    	forum.creationDate = new Date();
    	
    	User user = new User();
    	user.name = "Usuario 1";
    	user.creationDate = new Date();
    	user.password = "secret";
    	user.email = "usuario@email.com";
    	user.save();
    	
    	forum.user = user;
    	
    	forum.save();
       
    	List<models.Forum> forums = models.Forum.find.all();
        return ok(views.html.Forums.index.render(forums));
    }


    public static Result save() {
    	  flash("success", "The item has been created");
    	  return redirect("/");
    }

}