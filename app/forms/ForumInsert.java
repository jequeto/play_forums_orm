package forms;

import java.util.*;

import play.data.validation.*;
//import models.Forum; // It's not possible to import because this class has the same name (Form)


public class ForumInsert extends forms.ForumBase {
		
		public List<ValidationError> validate() {
		    List<ValidationError> errors = new ArrayList<ValidationError>();
		    if (! models.Forum.isUniqueInsert("name", this.name)) {
		        errors.add(new ValidationError("name", "This name is already registered."));
		    }
		    return errors.isEmpty() ? null : errors;
		   
		}
}