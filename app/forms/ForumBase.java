package forms;

import java.util.*;

import play.data.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.*;

import javax.persistence.*;


public class ForumBase {
	
    @Id
    public Long id;
    
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
