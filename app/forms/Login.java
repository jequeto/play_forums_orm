package forms;

import java.util.*;

import play.data.validation.*;


public class Login {
    
	@Constraints.Email
    @Constraints.Required
    public String email;
	
    @Constraints.Required
    public String password;  
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String value) {
    	email = value;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setPassword(String value) {
    	password = value;
    }
    
    
}