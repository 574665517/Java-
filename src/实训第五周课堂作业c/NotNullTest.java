package 实训第五周课堂作业c;

import java.lang.reflect.Method;

public class NotNullTest {
	public static void main(String[] args) throws Exception {
		Class<?> c = null;
		c = Class.forName("实训第五周课堂作业c.Demo1");
		Method method = c.getMethod("toString");//取得toString方法 
		if(method.isAnnotationPresent(NotNull.class)) {
			//取得自定义的Annotation
			NotNull annotation = method.getAnnotation(NotNull.class);
			String order = annotation.order();
			String request = annotation.request();//得到Annotation中指定变量的内容
			System.out.println("order = " + order);
			System.out.println("request = " + request);
		}
	}
}
