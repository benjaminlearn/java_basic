package org.benjamin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = { ElementType.FIELD })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
	
	public int id() default -1;
	
	public String name() default "";
	
	public String address() default "";
}
