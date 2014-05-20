package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.*;

@Entity
@SuppressWarnings("serial")
public class Forum extends Model {
    
    @Id
    public Long id;
    
    @Version
    protected Long version;
    
    @Constraints.Required
    @Constraints.MinLength(1)
    @Column(unique=true)
    public String name;
    
    public String description;
        
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
   
    @ManyToOne
    @Constraints.Required
    public User creatorUser;
    
    @OneToMany(cascade=CascadeType.ALL)
    public List<Theme> themes;  
    
    @ManyToMany(cascade=CascadeType.ALL)
    public List<User> moderators;
  
    
    public static Finder<Long,Forum> find = new Finder<Long,Forum>(Long.class, Forum.class);
    
    
    public static Boolean isUniqueInsert(String colum, String newValue) {
    	// If It selects null, the new value is unique in the table
    	Forum forum = Forum.find.where().eq(colum, newValue).findUnique();
    	return(forum == null);
    	
    }
    
    
    public static Boolean isUniqueUpdate(Long id, String colum, String newValue) {
    	
    	// If It selects null, the new value is unique in the table for update
    	Forum forum = Forum.find.where().eq(colum, newValue).ne("id", id).findUnique();
    	return(forum == null);
    	
    }
    
    @Override
    public String toString() {
    	
    	return "{ id: "+id.toString()+", name: "+name+", description: "+description+" creationDate: "+creationDate.toString()+" }";
    	
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


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public User getCreatorUser() {
		return creatorUser;
	}


	public void setCreatorUser(User creatorUser) {
		this.creatorUser = creatorUser;
	}


	public List<Theme> getThemes() {
		return themes;
	}


	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}


	public List<User> getModerators() {
		return moderators;
	}


	public void setModerators(List<User> moderators) {
		this.moderators = moderators;
	}

    
    
}