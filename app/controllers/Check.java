package controllers;


import play.*;
import play.mvc.With;
import play.mvc.HandlerRef;
import controllers.Authorized;
import java.lang.annotation.*;

@With(Authorized.class)
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {
   String value();
}