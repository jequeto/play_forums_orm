package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
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

}