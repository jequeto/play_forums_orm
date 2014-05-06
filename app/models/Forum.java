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
    @Constraints.MinLength(2)
    public String name;
    
    
    public String description;
    
    
    @Constraints.Required
    @Formats.DateTime(pattern="dd/MM/yyyy")
    
    public Date creationDate; // = new Date();
    
    @OneToMany(cascade=CascadeType.ALL)
    public List<Theme> themes;
    
    @ManyToOne
    @Constraints.Required
    public User user;
  
    public static Finder<Long,Forum> find = new Finder<Long,Forum>(
        Long.class, Forum.class
    );
    
    

}