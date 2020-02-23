package ʵѵ�����ܿ�����ҵc;

import java.lang.reflect.Method;

public class NotNullTest {
	public static void main(String[] args) throws Exception {
		Class<?> c = null;
		c = Class.forName("ʵѵ�����ܿ�����ҵc.Demo1");
		Method method = c.getMethod("toString");//ȡ��toString���� 
		if(method.isAnnotationPresent(NotNull.class)) {
			//ȡ���Զ����Annotation
			NotNull annotation = method.getAnnotation(NotNull.class);
			String order = annotation.order();
			String request = annotation.request();//�õ�Annotation��ָ������������
			System.out.println("order = " + order);
			System.out.println("request = " + request);
		}
	}
}
