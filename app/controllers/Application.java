package controllers;

import play.*;
import play.mvc.*;


import views.html.*;


@With(Authorized.class)
public class Application extends Controller {

    public static Result index() {
//      return ok(views.html.Application.index.render("Your new application is ready."));
        return redirect(routes.Forums.index());
    }

    @Check("permiso")
    public static Result actionInfo() {
 
    	return ok(views.html.Application.actionInfo.render(null,null,null));
    	
    }
    
    
   
    
}
