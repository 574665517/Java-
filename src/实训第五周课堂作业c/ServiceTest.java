package ʵѵ�����ܿ�����ҵc;

import java.lang.reflect.Method;

public class ServiceTest {
	public static void main(String[] args) throws Exception {
		Class<?> c = null;
		c = Class.forName("ʵѵ�����ܿ�����ҵc.Demo");
		Method method = c.getMethod("toString");//ȡ��toString���� 
		if(method.isAnnotationPresent(Service.class)) {
			Service annotation = method.getAnnotation(Service.class);
			String value = annotation.value();//�õ�Annotation��ָ������������
			System.out.println("value = " + value);
		}
	}
}
