package annotations;

import play.*;
import play.libs.*;
import play.mvc.*;

public class VerboseAction extends play.mvc.Action.Simple {
	
	@Override
    public F.Promise<SimpleResult> call(Http.Context ctx) throws Throwable {
        Logger.info("Calling action for " + ctx);
        return delegate.call(ctx);
//        return null;
    }
}