package ����;

import java.lang.reflect.Array;

/**
 * �޸�����Ĵ�Сʾ��
 * @author ywx
 * @ date 2019��6��12��
 */
public class ChangeArrayDemo {
	public static void main(String[] args) throws Exception {
		int temp[] = {1,2,3}; // ����һ����������
		int newTemp[] = (int[])arrayInc(temp, 5);//�������鳤��
		print(newTemp);// ��ӡ������Ϣ
		System.out.println("\n----------------------------");
		String t[] = { "Hello", "word", "java" };//�ַ�������
		String nt[] = (String[])arrayInc(t,8);//�������鳤��
		print(nt);// ��ӡ������Ϣ
	}
	
	public static Object arrayInc(Object obj,int len){//�������С
		Class<?> c = obj.getClass() ; // ͨ������õ�Class����
		Class<?> arr = c.getComponentType();//�����Class����
		Object newO = Array.newInstance(arr, len);//�µ������С
		int co = Array.getLength(obj);// ȡ�����鳤��
		System.arraycopy(obj, 0, newO, 0, co);// ������������
		return newO;
	}
	
	public static void print(Object obj){ // �������
		Class<?> c = obj.getClass(); //ͨ������õ�Class����
		if(!c.isArray()) { //�ж��Ƿ�������
			return ; //�����򷵻�
		}
		Class<?> arr = c.getComponentType();//ȡ�������Class
		System.out.println(arr.getName() + "����ĳ�����:" + Array.getLength(obj));
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i) + "��");
		}
	}
}
