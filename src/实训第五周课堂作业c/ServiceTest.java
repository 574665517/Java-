package 实训第五周课堂作业c;

import java.lang.reflect.Method;

public class ServiceTest {
	public static void main(String[] args) throws Exception {
		Class<?> c = null;
		c = Class.forName("实训第五周课堂作业c.Demo");
		Method method = c.getMethod("toString");//取得toString方法 
		if(method.isAnnotationPresent(Service.class)) {
			Service annotation = method.getAnnotation(Service.class);
			String value = annotation.value();//得到Annotation中指定变量的内容
			System.out.println("value = " + value);
		}
	}
}
