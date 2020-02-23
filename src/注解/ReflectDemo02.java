package ע��;

import java.lang.reflect.Method;

public class ReflectDemo02 {
	public static void main(String args[]) throws Exception {
		Class<?> c = null ; // ȡ��Classʵ��
		c = Class.forName("ע��.SimpleBeanTwo") ;
		Method toM = c.getMethod("toString");//ȡ��toString()����
		if (toM.isAnnotationPresent(MyAnnotationReflect.class)) {
			MyAnnotationReflect mda = null; // �����Զ����Annotation����
			// ȡ���Զ����Annotation
			mda = toM.getAnnotation(MyAnnotationReflect.class);
			String key = mda.key(); // �õ�Annotation��ָ������������
			String value = mda.value();// �õ�Annotation��ָ������������
			System.out.println("key = " + key);// ���Annotation�е�key
			System.out.println("value = " + value);//���Annotation�е�value
		}
	}
}
