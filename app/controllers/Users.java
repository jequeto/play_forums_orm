package controllers;

import java.util.Date;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*; 
import models.*;

import com.avaje.ebean.*;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSql.*;

public class Users extends Controller {
	
	
	public static Result login() {
		if (session().get("userEmail") == null) {
			return ok(views.html.Users.login.render(Form.form(forms.Login.class)));
		}
		else {
			return redirect(routes.Forums.index());
		}
	}
	
	
	public static Result logout() {
		
		if (session().get("connectionId") != null) {
			models.Connection connection = models.Connection.find.byId(Long.valueOf(session().get("connectionId")));
			connection.setCloseDateTime(new Date());
			connection.update();
		}
		session().clear();
		
		flash("alert", "You are logout");
	    return redirect(routes.Users.login());
	}
	
	
	public static Result authenticate() {
		
		Form<forms.Login> loginForm = Form.form(forms.Login.class).bindFromRequest();
		
		User user = User.authenticate(loginForm); 
		if (user != null)  {
			session().clear();
			session("userEmail", loginForm.field("email").value());
			session("userId", Long.toString(user.id));			
			// Create/insert the connection row and the entry session
			session("connectionId", Long.toString(models.Connection.insert(user)));
			
			flash("alert", "Login successfull");
			return redirect(routes.Forums.index());
		}
		else {
			loginForm.reject("Email or password error");
			return badRequest(views.html.Users.login.render(loginForm));
//			return ok("Fallido");
		}
		
	}
	
	
	public static Result unAuthorized() {
		
		return badRequest(views.html.Users.unAuthorized.render());
		
	}
	
	
	public static Result register() {
		
		return TODO;
		
	}
	

}
