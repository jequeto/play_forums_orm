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
public class Role extends Model {
    
    
    @Id
    public Long id;
  
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String name;
    
    @ManyToMany
    public List<Permission> permissions;
  
    public static Finder<Long,Role> find = new Finder<Long,Role>(
        Long.class, Role.class
    );
    
}