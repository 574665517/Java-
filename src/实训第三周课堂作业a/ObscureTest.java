package ʵѵ�����ܿ�����ҵa;

class X {//�²����ʲô��White
	/**
	 * ��̬�ڲ���ʹ�÷������ڲ�����ʹ�÷�����ͬ
	 */
//	static C Y = new C();
	static class Y {//��̬�ڲ���Y
		static String Z = "Black";
    }
//	static C Y = new C();//��̬����Y����������.������
}
class C {
	String Z = "White";
}

public class ObscureTest {
	public static void main(String[] args) {
		System.out.println(X.Y.Z);
//		System.out.println(new X().Y().Z);
	}
}


