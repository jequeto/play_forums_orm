package annotations;

import play.*;
import play.mvc.*;
import play.libs.*;
import java.lang.annotation.*;

import annotations.*;

@With(VerboseAnnotationAction.class)
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface VerboseAnnotation {
    boolean value() default true;
}