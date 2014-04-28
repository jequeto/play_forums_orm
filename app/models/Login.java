package models;

import java.util.*;

import play.data.validation.*;


public class Login {
    
        
    @Constraints.Required
    public String password;
    
    @Constraints.Email
    @Constraints.Required
    public String email;
    
}