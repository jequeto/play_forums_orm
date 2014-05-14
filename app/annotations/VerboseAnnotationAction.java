package annotations;

import play.*;
import play.libs.*;
import play.mvc.*;
import annotations.*;

public class VerboseAnnotationAction extends Action<VerboseAnnotation> {

	@Override
	public F.Promise<SimpleResult> call(Http.Context ctx)
            throws java.lang.Throwable {
    
        if (configuration.value()) {
            Logger.info("Calling action for " + ctx);
            return delegate.call(ctx);
        }
        else {

        	return F.Promise.pure((SimpleResult)redirect(controllers.routes.Users.login().url()));

        }
        
   
    }
}