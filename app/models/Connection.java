package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;



@Entity
@SuppressWarnings("serial")
public class Connection extends Model{
	
	@Version
    protected Long version;

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

    /**
     * Insert a new Connection and return the id value of the inserted row.<br/>
     * Sentences are involved in a transaction to avoid other instance insert a new row on 
     * the same moment.
     *  
     * @param User The user that is just logged
     * @return Long The id of the inserted connection
     */
    @Transactional
    public static Long insert(models.User user) {
    	
    	Connection connection = new Connection();
		connection.setUser(user);
		connection.setInitDateTime(new Date());
		connection.save();
    	Long lastId = getLastId();
		
    	return lastId;
    	
    }
    
    
    private static Long getLastId() {
    	
        return (Long) Connection.find.orderBy("id desc").findIds().get(0);
        
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInitDateTime() {
		return initDateTime;
	}

	public void setInitDateTime(Date initDateTime) {
		this.initDateTime = initDateTime;
	}

	public Date getCloseDateTime() {
		return closeDateTime;
	}

	public void setCloseDateTime(Date closeDateTime) {
		this.closeDateTime = closeDateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	
    
}