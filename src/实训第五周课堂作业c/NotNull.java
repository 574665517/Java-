package ʵѵ�����ܿ�����ҵc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
	public String order() default "Hello";
	public String request() default "java";
}
