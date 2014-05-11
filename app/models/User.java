package models;

import java.util.*;

import javax.persistence.*;
//import javax.persistence.Column;

import play.db.ebean.*;
import play.data.Form;
import play.data.format.*;
import play.data.validation.*;


@Entity
@SuppressWarnings("serial")
public class User extends Model {
    
    
    @Id
    public Long id;
  
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
    	this.save();
    }
    
    
    public static Boolean authenticate(Form<Login> form) {
    	List<User> users = User.find.where().eq("email", form.field("email").value()).eq("password",form.field("password").value()).findList();
        if (users.isEmpty()) {
            return false;
        }
        else {
        	return true;
        }
//      returns( ! users.isEmpty());
    }
    
    
    
}