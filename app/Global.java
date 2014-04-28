
import java.util.*;

import play.*;
import play.libs.*;

import com.avaje.ebean.Ebean;

import models.*;


public class Global extends GlobalSettings {
	
    @Override
    public void onStart(Application app) {
        // Check if the database is empty
        if (User.find.findRowCount() == 0) {
//      	Ebean.save((List) Yaml.load("initial-data.yml"));
        	User user = new User("jesus", "jesus00", "jesus@email.com");
        }
    }
    
}