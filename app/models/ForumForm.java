package models;

import java.util.*;
import play.data.*;
import play.data.validation.*;

public class ForumForm {
	
	@Constraints.Required
//	@Constraints.Min(1)
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
