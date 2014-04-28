package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*; 

import models.*;

public class Users extends Controller {
	
	public static Result login() {
	    return ok(views.html.Users.login.render(Form.form(Login.class)));
	}
	
	public static Result authenticate() {
		Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
		if (User.authenticate(loginForm))  {
			
			return ok("Validado");
		}
		else {
			loginForm.reject("Email or password error");
			return ok(views.html.Users.login.render(loginForm));
//			return ok("Fallido");
		}
	}
	
	

}
