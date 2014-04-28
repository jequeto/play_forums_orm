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
    public Date initDate; // = new Date();
    
    @Formats.DateTime(pattern="dd/MM/yyyy H:i:s")
    public Date closeDate; // = new Date();
    
    @Constraints.Required
    @ManyToOne
    public User user;
  
    public static Finder<Long,User> find = new Finder<Long,User>(
        Long.class, User.class
    ); 

}