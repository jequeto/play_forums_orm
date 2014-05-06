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
  
    @Constraints.Required
    public String text;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date creationDate; // = new Date();
    
    @ManyToOne(cascade=CascadeType.REMOVE)
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

}