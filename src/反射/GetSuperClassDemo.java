package ����;

/**
 * ȡ��Person�ĸ���
 * @author ywx
 * @ date 2019��6��12��
 */
public class GetSuperClassDemo {
	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {// ʵ����Class����
			c1 = Class.forName("javax.swing.JFrame");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass(); // ȡ�ø���
		Class<?> c3 = c2.getSuperclass();
		System.out.println("�������ƣ�" + c2.getName());// �����Ϣ
		System.out.println("����ĸ������ƣ�" + c3.getName());
	}
}
