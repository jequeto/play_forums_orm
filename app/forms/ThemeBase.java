package forms;

import java.util.*;

import play.data.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.*;

import javax.persistence.*;

import models.Forum;


public class ThemeBase {
    
    @Id
    public Long id;
  
    @Constraints.Required
    @Constraints.MinLength(1)
    public String name;

	@Constraints.Required
    public Long forum_id;
    
	/**
	 * Use to transport forum's name to the view.
	 */
	@Constraints.Required
    public String forum_name;
	
	
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
    

	public Long getForum_id() {
		return forum_id;
	}

	public void setForum_id(Long forum_id) {
		this.forum_id = forum_id;
	}

	public String getForum_name() {
		return forum_name;
	}

	public void setForum_name(String forum_name) {
		this.forum_name = forum_name;
	}	
	
}