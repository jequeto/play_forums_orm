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
    
    @OneToMany(cascade=CascadeType.REMOVE)
    public List<Theme> themes;
    
    
    
    @ManyToMany(cascade=CascadeType.REMOVE)
    public List<User> moderators;
  
    
    public static Finder<Long,Forum> find = new Finder<Long,Forum>(
        Long.class, Forum.class
    );
    
    

}