package ʵѵ�����ܿ�����ҵa;

public class Test15 extends Throw {//�����������,д�������˵��Ե�ɣ�����ʱ�쳣
	void myThow()/* throws ���ʽ */ {
		try {
			myThow_1(7, 0);// 7 / 0�׳������쳣
		} catch (ArithmeticException e) {
			System.out.println();
		}
			throw new RuntimeException("����ʱ�쳣");
		}
	public static void main(String[] args) {
		new Test15().myThow();
	}
}
class Throw {
	void myThow() throws ArithmeticException, InterruptedException {
	myThow_1(3, 6);
}
	int myThow_1(int x, int y) throws ArithmeticException {
	return x / y;
	}
}
