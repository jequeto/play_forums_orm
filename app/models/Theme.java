package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;

@Entity
@SuppressWarnings("serial")
public class Theme extends Model {
        
    @Id
    public Long id;
    
    @Version
    protected Long version;
  
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String name;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
    
    @ManyToOne(cascade=CascadeType.ALL)
    @Constraints.Required
    public Forum forum;
    
    @OneToMany(cascade=CascadeType.ALL)
    public List<Message> messages;
    
    
    @ManyToOne
    @Constraints.Required
    public User user;
    
  
    public static Finder<Long,Theme> find = new Finder<Long,Theme>(
        Long.class, Theme.class
    ); 
    
    public static List<Theme> findByForumId(Long forumId) {
    	
    	return Theme.find.setAutofetch(true).where().eq("forum_id", forumId).findList();
    	
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
    

}