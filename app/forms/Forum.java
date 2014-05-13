package forms;

import play.data.validation.*;


public class Forum {
	
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
