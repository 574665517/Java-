package 实训第六周课堂作业;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotations {
	@Target( ElementType.TYPE )
	@Retention( RetentionPolicy.RUNTIME )
	public @interface Filters {//@interface 声明一个注解
		Filter[] value();
	}
	
	@Target( ElementType.TYPE )
	@Retention( RetentionPolicy.RUNTIME )
	@Repeatable( Filters.class ) //该注解可重复使用
	public @interface Filter {
		String value();
	};
}