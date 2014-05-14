package forms;

import java.util.*;

import play.data.*;
import play.data.format.*;
import play.data.validation.*;
//import models.Forum; // It's not possible to import because this class has the same name (Form)



public class ForumBase {
	
	@Constraints.Required
	@Constraints.MinLength(1)
    public String name;
    

	public String description;
    
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
