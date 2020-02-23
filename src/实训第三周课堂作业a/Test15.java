package 实训第三周课堂作业a;

public class Test15 extends Throw {//分析下面代码,写出结果，说明缘由？运行时异常
	void myThow()/* throws 表达式 */ {
		try {
			myThow_1(7, 0);// 7 / 0抛出算术异常
		} catch (ArithmeticException e) {
			System.out.println();
		}
			throw new RuntimeException("运行时异常");
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
