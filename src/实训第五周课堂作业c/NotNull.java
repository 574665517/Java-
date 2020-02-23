package 实训第五周课堂作业c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
	public String order() default "Hello";
	public String request() default "java";
}
