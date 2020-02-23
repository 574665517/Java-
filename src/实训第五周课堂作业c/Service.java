package 实训第五周课堂作业c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//自定义Service
public @interface Service {
	public String value() default "hello";//定义一个value变量
}
