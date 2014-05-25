package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.format.*;
import play.data.validation.*;
import models.User;


@Entity
@SuppressWarnings("serial")
public class Connection {

    @Id
    public Long id;
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy H:i:s")
    public Date initDateTime; // = new Date();
    
    @Formats.DateTime(pattern="dd/MM/yyyy H:i:s")
    public Date closeDateTime; // = new Date();
    
    @Constraints.Required
    @ManyToOne
    public User user;
  
    public static Finder<Long,Connection> find = new Finder<Long,Connection>(
        Long.class, Connection.class
    ); 

    public static List<Connection> findByUser(User user) {
    	
    	return Connection.find.where().eq("user_id", user.id).findList();
    			
    }
    
}