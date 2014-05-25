package controllers;

import play.*;
import play.mvc.*;
import models.Permission;

public class Permissions extends Controller {
	
	public static Result crud() {
		
		Permission permission = new Permission();
//		permission.name = "**";
//		permission.save();
		
		permission = Permission.find.byId(1L);
//		permission.setVersion();
		permission.setName("pruebassss");
		permission.update();
		
//		permission = new Permission();
//		permission.name = "***";
//		permission.save();
//		
//		permission = Permission.find.byId(2L);
//		permission.delete();
//		
				
		return ok(permission.toString());
		
	}

	
}
