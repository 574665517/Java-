package ����;

import java.lang.reflect.Constructor;

/**
 * @author ywx
 * @ date 2019��6��12��
 */
public class GetConstructorDemo01 {
	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {
		c1 = Class.forName("����.Person");//ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();//ȫ�����췽��
		for (int i = 0; i < con.length; i++) {
			System.out.println("���췽����" + con[i]);//ֱ�Ӵ�ӡ���
		}
	}
}
