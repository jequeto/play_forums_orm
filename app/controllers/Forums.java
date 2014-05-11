package controllers;

import java.util.*;

import play.*;
import play.data.*;
import play.mvc.*;
import play.mvc.Http.Context;
import static play.data.Form.*;
import views.html.*;
import models.*;

public class Forums extends Controller {

	@Security.Authenticated(Secured.class) 
    public static Result index() {
       
    	List<models.Forum> forums = models.Forum.find.all();
        return ok(views.html.Forums.index.render(forums));
    }

    
    public static Result insert() {
    	Form<Forum> forumForm = Form.form(Forum.class);
    	
    	return ok("");
    }
    
    
    public static Result insertValidate() {    	
    	
    	Form<models.ForumForm> forumForm = Form.form(models.ForumForm.class).bindFromRequest();
    	
    	if (forumForm.hasErrors()) {
    		return badRequest(views.html.Forums.insert.render(forumForm));
    	}
    	else {
	    	models.Forum forum = new models.Forum();
	    	forum.name = forumForm.field("name").value();
	    	forum.description = forumForm.field("description").value();
	    	forum.creationDate = new Date();
	    	
	    	User user = new User();
	    	user.name = "Usuario Pruebas";
	    	user.creationDate = new Date();
	    	user.password = "secret";
	    	user.email = "usuario@email.com";
	    	user.save();
	    	
	    	forum.user = user;
	    	
	    	forum.save();
	    	
	    	flash("alert", "New Forum has being created");
	    	return redirect(routes.Forums.index());
    	}
    }
    
    @Security.Authenticated(Authenticator.class)
    public static Result update(Long forumId) {
    	// Html(Controller.ctx().getClass())
    	return ok("update: "+forumId.toString());
    }
    
    @Security.Authenticated(Authenticator.class)
    public static Result delete(Long forumId) {
    	// Html(Controller.ctx().getClass())
    	return ok("delete: "+forumId.toString());
    }
    
    

}