package controllers;

import java.util.*;

import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import models.*;

public class Messages extends Controller {

    public static Result index(Long themeId) {
    	
    	
    	Theme theme = Theme.find.fetch("forum").fetch("creatorUser").where().eq("id",themeId).findUnique();
    	List<Message> messages = Message.findByThemeId(themeId);
    	
        return ok(views.html.Messages.index.render(theme, messages));
    }

    
    
    public static Result insert(Long themeId) {
    	
    	return TODO;
    	
    }
    
    
    public static Result insertValidate(Long themeId) {
    	
    	Form<forms.Message> messageForm = Form.form(forms.Message.class).bindFromRequest();
  	
    	if (messageForm.hasErrors()) {
    		return badRequest(views.html.Messages.insert.render(messageForm));
    	}
    	else {
    		models.Message message = new models.Message();
            message.setText(messageForm.field("text").value());
            message.setTheme(models.Theme.find.byId(Long.valueOf(messageForm.field("theme_id").value())));
            message.setCreatorUser(User.findByEmail(session().get("userEmail")));
            message.setCreationDate(new Date());
            message.save();
    		
    		flash("alert", "The new message has sussefully been added");
    		return redirect(routes.Messages.index(Long.valueOf(messageForm.field("theme_id").value())));
    	}
    
    }
    
    
    public static Result update(Long messageId) {
    	
    	Message message = Message.find.fetch("theme").where().eq("id", messageId).findUnique();
    	Map<String,String> data = new HashMap();
    	data.put("id", Long.toString(message.id));
    	data.put("text", message.text);
    	data.put("theme_id", Long.toString(message.theme.id));
    	Form<forms.Message> formMessage = Form.form(forms.Message.class).bind(data);
    	
    	Theme theme = Theme.find.fetch("forum").where().eq("id", message.theme.id).findUnique();
    	
    	return ok(views.html.Messages.update.render(theme, formMessage));
    	
    }
    
    
    public static Result updateValidate(Long messageId) {
    	
    	Form<forms.Message> formMessage = Form.form(forms.Message.class).bindFromRequest();
    	
    	if (formMessage.hasErrors()) {
    		Theme theme = Theme.find.fetch("forum")
    						.where()
    						.eq("id", Long.valueOf(formMessage.field("theme_id").value()))
    						.findUnique();
    		if (theme != null) {
    			return badRequest(views.html.Messages.update.render(theme, formMessage));
    		}
    		else {
    			return badRequest(views.html.noFoundPage.render(""));
    		}
    	}
    	else {
    		models.Message message = models.Message.find.byId(Long.valueOf( formMessage.field("id").value() ) );
    		message.setText(formMessage.field("text").value());
    		message.update();
    		flash("alert", "The message has sussefully been modified");
    		return redirect(routes.Messages.index(Long.valueOf(formMessage.field("theme_id").value())));
    	}
    	
    }
    
    
    public static Result delete(Long messageId) {
    	
    	Message message = Message.find.fetch("theme").where().eq("id", messageId).findUnique();
    	Map<String,String> data = new HashMap();
    	data.put("id", Long.toString(message.id));
    	data.put("text", message.text);
    	data.put("theme_id", Long.toString(message.theme.id));
    	Form<forms.Message> formMessage = Form.form(forms.Message.class).bind(data);
    	
    	Theme theme = Theme.find.fetch("forum").where().eq("id", message.theme.id).findUnique();
    	
    	return ok(views.html.Messages.delete.render(theme, formMessage));
    	
    }
    
    
    public static Result deleteValidate(Long themeId) {
    	
    	Form<forms.Message> formMessage = Form.form(forms.Message.class).bindFromRequest();
    	
    	if (formMessage.hasErrors()) {
    		Theme theme = Theme.find.fetch("forum").where()
    				.eq("id", Long.valueOf(formMessage.field("theme_id").value()))
    				.findUnique();
    		return badRequest(views.html.Messages.delete.render(theme, formMessage));
    	}
    	else {
    		models.Message message = models.Message.find.byId(Long.valueOf( formMessage.field("id").value() ) );
    		if (message == null) {
    			return badRequest(views.html.noFoundPage.render(""));
    		}

    		message.delete();
    		flash("alert", "The message has sussefully been deleted");
    		return redirect(routes.Messages.index(Long.valueOf(formMessage.field("theme_id").value())));
    	}
    }



    

}