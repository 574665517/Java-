package ����;

import java.lang.reflect.Method;

/**
 * ����Person���е�sayHello()����
 * @author ywx
 * @ date 2019��6��12��
 */
public class InvokeSayHelloDemo {

	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {
			c1 = Class.forName("����.Human");//ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayHello", String.class, int.class);//��Ҫ��������
			String rv = null;// ���շ����ķ���ֵ
			// ���÷���,���봫�ݶ���ʵ��,ͬʱ������������ֵ
			rv = (String)met.invoke(c1.newInstance(), "���޼�", 30);
			System.out.println(rv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
