package ����;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ȡ��Person���е����� ���� ȡ�ñ�������
 * @author ywx
 * @ date 2019��6��12��
 */
public class GetFieldDemo1 {
	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("����.Human") ;//ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	{ // ��ͨ�����
		Field f[] = c1.getDeclaredFields();// ȡ�ñ�������
		for (int i = 0; i < f.length; i++) {// ѭ�����
			Class<?> r = f[i].getType();// ȡ�����Ե�����
			int mo = f[i].getModifiers();//���η�����
			String priv = Modifier.toString(mo);//���η�
			System.out.print("�������ԣ�");
			System.out.print(priv + " ");// ������η�
			System.out.print(r.getName() +" ");//��������
			System.out.print(f[i].getName());// ���������
			System.out.println(" ;"); // ����
		}
	}
	}

}
