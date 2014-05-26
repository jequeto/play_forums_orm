package controllers;

import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;

public class Connections extends Controller {

	
	
	public static Result index() {
		
		List<models.Connection> connections = models.Connection.find
				.fetch("user")
				.orderBy("init_date_time DESC")
				.setMaxRows(100)
				.findList();
//		return ok(connections.toString());
		return ok(views.html.Connections.index.render(connections));
		
	}
	
}
