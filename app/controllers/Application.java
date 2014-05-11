package controllers;

import play.*;
import play.mvc.*; 

import views.html.*;

import java.lang.reflect.Method;

public class Application extends Controller {

    public static Result index() {
//      return ok(views.html.Application.index.render("Your new application is ready."));
        return redirect(routes.Forums.index());
    }

    
    public static Result actionInfo() {
 
    	return ok(views.html.Application.actionInfo.render(null,null,null));
    	
    }
    
    
   
    
}
