package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test4 {
	
	//��Щ�ñ������������������
	
	public void methodA(String str, Integer... is) {//�ɱ����
		System.out.println("����1...");
	}
	
	public void methodA(String str, String... strs) {//�ɱ����
		System.out.println("����2...");
	}

	public static void main(String[] args) {
//	    Test3 test3 = new Test3();
//		test3.methodA("China" ,0);
//		test3.methodA("China", "People");
//		test3.methodA("China");
//		test3.methodA("China", null);
		Test4 test4 = new Test4();
		test4.methodA("China" ,0);
		test4.methodA("China", "People");
//		test4.methodA("China");
//		test4.methodA("China", null);//����Object����������
	}

}
