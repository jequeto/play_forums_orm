package forms;

import java.util.*;

import play.data.validation.*;
//import models.Forum; // It's not possible to import because this class has the same name (Form)


public class ForumUpdate extends forms.ForumBase {
		
		public List<ValidationError> validate() {
		    List<ValidationError> errors = new ArrayList<ValidationError>();
		    if (! models.Forum.isUniqueUpdatet(parent.id, "name", parent.name)) {
		        errors.add(new ValidationError("name", "This name is already registered."));
		    }
		    return errors.isEmpty() ? null : errors;
		}
}