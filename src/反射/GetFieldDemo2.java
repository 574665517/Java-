package ����;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ȡ��Person���е����� ���� ȡ�ø��๫������
 * @author ywx
 * @ date 2019��6��12��
 */
public class GetFieldDemo2 {
	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {
			c1 = Class.forName("����.Human");//ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	{ // ��ͨ�����
		Field f[] = c1.getFields(); // ȡ�ø��๫������
		for (int i = 0; i < f.length; i++) {
			Class<?> r = f[i].getType();//���Ե�����
			int mo = f[i].getModifiers() ;//ȡ�����η�����
			String priv = Modifier.toString(mo);//�������η�
			System.out.print("�������ԣ�");
			System.out.print(priv + " ");// ������η�
			System.out.print(r.getName() + " ");//��������
			System.out.print(f[i].getName());//��������
			System.out.println(" ;"); // ����
		}
	}
	}

}
