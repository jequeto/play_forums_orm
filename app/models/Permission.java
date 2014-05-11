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
public class Permission extends Model {
    
    
    @Id
    public Long id;
  
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String name;
    
  
    public static Finder<Long,User> find = new Finder<Long,User>(
        Long.class, User.class
    );   
    
}