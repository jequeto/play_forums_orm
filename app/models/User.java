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
  
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String password;
    
    @Constraints.Email
    @Constraints.Required
    public String email;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
  
    public static Finder<Long,User> find = new Finder<Long,User>(
        Long.class, User.class
    ); 

    
    public User() {
    	
    }
    
    
    public User(String name, String password, String email) {
    	this.name = name;
    	this.password = password;
    	this.email = email;
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
    }
    
    
    
}