package ����;

import java.lang.reflect.Method;

/**
 * ����Person���е�sayChina()����
 * @author ywx
 * @ date 2019��6��12��
 */
public class InvokeSayChinaDemo {

	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {
			c1 = Class.forName("��˭.Human");//ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayChina");//�޲���
			met.invoke(c1.newInstance()); //���÷���,���봫�ݶ���ʵ��
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
