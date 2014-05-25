package controllers;

import java.util.*;

import com.avaje.ebean.Ebean;

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
//		The next two lines don't fetch creatorUser and themes from forum

//    	List<models.Forum> forums = models.Forum.find.all(); // Don't read members
		
    	List<models.Forum> forums = models.Forum.find.fetch("themes").fetch("creatorUser").findList();
//    	List<models.Forum> forums = models.Forum.find.setAutofetch(true).findList(); // Don't read fetch
        return ok(views.html.Forums.index.render(forums));
        
    }

    
    public static Result insert() {
    	
    	Form<forms.ForumInsert> forumForm = Form.form(forms.ForumInsert.class);

    	return ok(views.html.Forums.insert.render(forumForm));
    	
    }
    
    
    public static Result insertValidate() {    	
    	
    	Form<forms.ForumInsert> forumForm = Form.form(forms.ForumInsert.class).bindFromRequest();
    	
    	if (forumForm.hasErrors()) {
    		return badRequest(views.html.Forums.insert.render(forumForm));
    	}
    	else {
	    	models.Forum forum = new models.Forum();
	    	forum.name = forumForm.field("name").value();
	    	forum.description = forumForm.field("description").value();
	    	forum.creationDate = new Date();
	    	
	    	User user = User.findByEmail(session().get("userEmail"));
	    		    	
	    	forum.creatorUser = user;
	    	
	    	forum.save();
	    	
	    	flash("alert", "New Forum has being created");
	    	return redirect(routes.Forums.index());
    	}
    }
    

    public static Result update(Long forumId) {
    	
    	models.Forum forum = models.Forum.find.byId(forumId);

    	if (forum != null) {
	    	forms.ForumUpdate formUpdate = new forms.ForumUpdate();
	    	formUpdate.id = forum.id;
	    	formUpdate.name = forum.name;
	    	formUpdate.description = forum.description;
	    	Form<forms.ForumUpdate> forumForm = Form.form(forms.ForumUpdate.class).fill(formUpdate);
	    	return ok(views.html.Forums.update.render(forumForm));
    	}
    	else {
    		flash("alert", "The forum selected for update don't exists.");
    		return redirect(routes.Forums.index());
    	}

    }
    
    
    public static Result updateValidate(Long forumId) {
    	
    	Form<forms.ForumUpdate> forumForm = Form.form(forms.ForumUpdate.class).bindFromRequest();

    	if (forumForm.hasErrors()) {
    		return badRequest(views.html.Forums.update.render(forumForm));
    	}
    	else {
    		models.Forum forum = models.Forum.find.byId(forumId);
    		
    		forum.setName(forumForm.field("name").value());
	    	forum.setDescription(forumForm.field("description").value());
	    	forum.update();
	    	
	    	flash("alert", "Forum has being modified");
	    	return redirect(routes.Forums.index());
    	}
    	
    }
    
    
    public static Result delete(Long forumId) {
    	
    	models.Forum forum = models.Forum.find.byId(forumId);
    	forms.ForumBase formDelete = new forms.ForumBase();
    	formDelete.id = forum.id;
    	formDelete.name = forum.name;
    	formDelete.description = forum.description;
    	
    	Form<forms.ForumBase> forumForm = Form.form(forms.ForumBase.class).fill(formDelete);
    	return ok(views.html.Forums.delete.render(forumForm));

    }
    
    
    public static Result deleteValidate(Long forumId) {
    	
    	models.Forum forum = models.Forum.find.byId(forumId);
  
    	forum.delete();
    	
    	flash("alert", "Forum has being deleted");
    	return redirect(routes.Forums.index());

    }

}