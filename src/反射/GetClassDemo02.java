package ����;

class S { // ����S��
}
	public class GetClassDemo02 {
		public static void main(String args[]) {
			Class<?> c1 = null; // ָ������
			Class<?> c2 = null; // ָ������
			Class<?> c3 = null; // ָ������
			try {
				//��õ���ʽ
				c1 = Class.forName("����.GetClassDemo01");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			c2 = new S().getClass();// ͨ��Object���еķ���ʵ��
			c3 = S.class; // ͨ����.classʵ����
			System.out.println("�����ƣ�" + c1.getName());//�������
			System.out.println("�����ƣ�" + c2.getName());//�������
			System.out.println("�����ƣ�" + c3.getName());//�������
		}
	}	
