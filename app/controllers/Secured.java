package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

	
    @Override
    public String getUsername(Context ctx) {
    	
        return ctx.session().get("userEmail");
        
    }

    
    @Override
    public Result onUnauthorized(Context ctx) {
    	
        return redirect(routes.Users.login());

       
    }
    
    
   
    
}