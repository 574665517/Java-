package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��23��
 */
public class Test06a {
	
	static int num = 1;
//	public static int x = 5;
//	private static int y = 6;
	
	public static void print() {
		System.out.println("static��������");
	}
	static {
		System.out.println("��̬�����");
	}

	public static void main(String[] args) {
		System.out.println(Test06a.num);//ֱ�������������ʾ�̬��Ա����
		Test06a.print();
		
	}

}
