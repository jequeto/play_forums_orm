package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.Form;
import play.data.format.*;
import play.data.validation.*;


@Entity
@SuppressWarnings("serial")
public class Role extends Model {
    
    
    @Id
    public Long id;
  
    @Version
    protected Long version;
    
    @Constraints.Required
    @Column(unique=true, nullable=false)
    public String name;
    
    @ManyToMany(cascade=CascadeType.ALL)
    public List<Permission> permissions;
  
    public static Finder<Long,Role> find = new Finder<Long,Role>(
        Long.class, Role.class
    );

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
    
    
    
}