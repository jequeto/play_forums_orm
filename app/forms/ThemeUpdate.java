package forms;

import java.util.*;

import play.data.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.*;

import javax.persistence.*;



public class ThemeUpdate extends ThemeBase {
	
	public List<ValidationError> validate() {
	    List<ValidationError> errors = new ArrayList<ValidationError>();
	    if (! models.Theme.isUniqueUpdateName(this.id, this.forum_id, this.name)) {
	        errors.add(new ValidationError("name", "This name is already registered."));
	    }
	    return errors.isEmpty() ? null : errors;
	   
	}
	
}
