package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*; 

import models.*;

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
		flash("alert", "You are logout");
		session().clear();
	    return redirect(routes.Users.login());
	}
	
	
	public static Result authenticate() {
		
		Form<forms.Login> loginForm = Form.form(forms.Login.class).bindFromRequest();
		
		User user = User.authenticate(loginForm); 
		if (user != null)  {
			session().clear();
			session("userEmail", loginForm.field("email").value());
			session("userId", Long.toString(user.id));
			request().setUsername(loginForm.field("email").value());
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
	
	

}
