package forms;

import java.util.*;


import play.data.format.*;
import play.data.validation.*;



@SuppressWarnings("serial")
public class Theme {
        
    public Long id;
  
    @Constraints.Required
    public String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
}