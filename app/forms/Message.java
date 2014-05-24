package forms;

import java.util.*;

import play.data.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.*;

import javax.persistence.*;

import models.Forum;


public class Message {
    
    @Id
    public Long id;
  
    @Constraints.Required
    @Constraints.MinLength(10)
    public String text;

	@Constraints.Required
    public Long theme_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getTheme_id() {
		return theme_id;
	}

	public void setTheme_id(Long theme_id) {
		this.theme_id = theme_id;
	}
    	
}