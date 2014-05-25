
import java.util.*;

import play.*;
import play.db.*;
import play.libs.*;
import play.libs.F.*;
import play.mvc.*;
import play.mvc.Action;
import play.mvc.Http.*;
import play.mvc.Http.Request;
import static play.mvc.Results.*;

import com.avaje.ebean.Ebean;
import models.*;

import java.lang.reflect.Method;



public class Global extends GlobalSettings {
	
    @Override
    public void onStart(Application app) {
    	
        // Check if the database is empty
        if (User.find.findRowCount() == 0) {
//      	Ebean.save((List) Yaml.load("initial-data.yml"));
        	User user = new User("admin", "admin00", "admin@email.com");
            user.save();
        	user = new User("jesus", "jesus00", "jesus@email.com");
            user.save();
        }
        
    }
    
    @Override
    public Action onRequest(Request request, Method actionMethod) {
    	
        System.out.println("before each request..." + request.toString());
//        System.out.println("before each request: Method.getName(): " + actionMethod.getName());
//        System.out.println("before each request: Method.getClass(): " + actionMethod.getClass());
//        
        return super.onRequest(request, actionMethod);
//        return null;
//        return super.onRequest(request, controllers.Application.actionInfo(actionMethod));
//		return null;
    }
    
    
    public Promise<SimpleResult> onError(RequestHeader request, Throwable t) {
    	
        return Promise.<SimpleResult>pure(internalServerError(views.html.errorPage.render(t)));
        
    }
    
    
    /**
     *  Manage the not found URI.
     *  If this method is comment, the system show the content of /public/routes file
     *  when DEBUG mode.
     */
//    public Promise<SimpleResult> onHandlerNotFound(RequestHeader request) {
//    	
//    	return Promise.<SimpleResult>pure(notFound(views.html.notFoundPage.render(request.uri())));
//        
//    }
    
    
    

    public Promise<SimpleResult> onBadRequest(RequestHeader request, String error) {
    	
            return Promise.<SimpleResult>pure(badRequest("Don't try to hack the URI!"));
            
    }

    
    
}