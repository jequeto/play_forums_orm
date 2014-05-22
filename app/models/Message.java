package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;

@Entity
@SuppressWarnings("serial")
public class Message extends Model {
    
    
    @Id
    public Long id;
  
    @Version
    protected Long version;
    
    @Constraints.Required
    @Column(nullable=false)
    public String text;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
    
    @ManyToOne
    @Constraints.Required
    public Theme theme;
    
    @ManyToOne
    @Constraints.Required
    public User user;
      
    public static Finder<Long,Message> find = new Finder<Long,Message>(
        Long.class, Message.class
    );
    
    public static List<Message> findByThemeId(Long themeId) {
    	return Message.find.where().eq("theme_id", themeId).findList();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    

}