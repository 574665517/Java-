package ����;

/**
 * ȡ��Person��ʵ�ֵ�ȫ���ӿ�
 * @author ywx
 * @ date 2019��6��12��
 */
public class GetInterfaceDemo {
	public static void main(String[] args) {
		Class<?> c1 = null ; // ����Class����
		try {// ʵ����Class����
			c1 = Class.forName("����.Human") ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces();// ȡ��ʵ�ֵ�ȫ���ӿ�
		for(int i = 0; i < c.length; i++) {
		// ����ӿ�����
		System.out.println("ʵ�ֵĽӿ����ƣ�"+ c[i].getName());
		}
	}
}
