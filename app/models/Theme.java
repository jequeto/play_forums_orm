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
  
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
    
    @ManyToOne
    @Constraints.Required
    public Forum forum;
    
    @OneToMany(cascade=CascadeType.ALL)
    @Constraints.Required
    public Message message;
    
    
    @ManyToOne
    @Constraints.Required
    public User user;
    
  
    public static Finder<Long,Theme> find = new Finder<Long,Theme>(
        Long.class, Theme.class
    ); 
    
    public static List<Theme> findByForumId(Long forumId) {
    	return Theme.find.where().eq("forum_id", forumId).findList();
    }

}