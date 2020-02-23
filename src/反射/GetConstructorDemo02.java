package ����;

import java.lang.reflect.Constructor;

/**
 * @author ywx
 * @ date 2019��6��12��
 */
public class GetConstructorDemo02 {
	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {// ʵ����Class����
			c1 = Class.forName("����.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] =c1.getConstructors();//ȫ������
		for (int i = 0; i < con.length; i++) {
			Class<?> p[] = con[i].getParameterTypes();//�Ĳ�������
			System.out.print("���췽����") ;
			System.out.print(con[i].getModifiers() + " ");//ȡ��Ȩ��
			System.out.print(con[i].getName()); //���췽������
			System.out.print("(");// �����(��
			for (int j = 0; j < p.length; j++) {// ��ӡ��������
				System.out.print(p[j].getName() + " arg" + i);
				if (j < p.length - 1) { // �ж��Ƿ�Ҫ�����,��
					System.out.print(",");
				}		
			}
			System.out.println("){}"); // �����){}��
		}
	}
}
