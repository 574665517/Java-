package ����;

import java.lang.reflect.Field;

public class InvokeFieldDemo {
	public static void main(String[] args) throws Exception {
		Class<?> c1 = null; // ����Class����
		Object obj = null; // ����һ������
		c1 = Class.forName("����.Human");//ʵ����Class����
		obj = c1.newInstance() ; // ʵ��������
		Field nameField = null ; // ��ʾname����
		Field ageField = null ; // ��ʾage����
		nameField = c1.getDeclaredField("name") ;//ȡ��name����
		ageField = c1.getDeclaredField("age") ;//ȡ��age����
		nameField.setAccessible(true);//�������óɿɱ��ⲿ����
		nameField.set(obj, "���޼�") ; // ����name��������
		ageField.setAccessible(true) ;//���óɿɱ��ⲿ����
		ageField.set(obj, 30) ; // ����age��������
		System.out.println("����:" + nameField.get(obj));//ȡ����������
		System.out.println("����:" + ageField.get(obj));//ȡ����������
	}
}
