package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.Form;
import play.data.format.*;
import play.data.validation.*;


@Entity
@SuppressWarnings("serial")
public class User extends Model {
    
    
    @Id
    public Long id;
  
    @Version
    protected Long version;
    
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String name;
    
    @Constraints.Required
    public String password;
    
    @Constraints.Email
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String email;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
    
//    @ManyToMany
//    public List<Forum> moderatedForums;
//  
    public static Finder<Long,User> find = new Finder<Long,User>(
        Long.class, User.class
    ); 

    
    public static User findByEmail(String email) {
    	
    	return User.find.where().eq("email", email).findUnique();
    			
    }
    
    public User() {
    	
    }
    
    
    public User(String name, String password, String email) {
    	this.name = name;
    	this.password = password;
    	this.email = email;
    	this.creationDate = new Date();
//    	this.save();
    }
    
    
    public static Boolean authenticate(Form<forms.Login> form) {
    	List<User> users = User.find.where().eq("email", form.field("email").value()).eq("password",form.field("password").value()).findList();
        if (users.isEmpty()) {
            return false;
        }
        else {
        	return true;
        }
//      returns( ! users.isEmpty());
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
    
    
    
    
    
}