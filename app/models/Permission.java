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
  
    @Version
    protected Long version;
    
    
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String name;
    
    
  
    public static Finder<Long,Permission> find = new Finder<Long,Permission>(
        Long.class, Permission.class
    );


	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", version="
				+ version + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getVersion() {
		return version;
	}


	public void setVersion(Long version) {
		this.version = version;
	}  
    
    
    
}