package math类型;

public class Test {

	public static void main(String[] args) {
		/**\
		 * 非静态方法在一个包不同类之间调用要创建对象再调用
		 */
		MathRandom g1 = new MathRandom();
		System.out.println("任意一个2-23的之间的偶数:" + g1.GetEvenNum(2, 23));
		/**
		 * 静态方法在一个包不同类之间调用 类名.方法名
		 */
		System.out.println("任意小写字符:" + MathRandom.GetRandomChar('a', 'z'));
		System.out.println("任意大写字符:" + MathRandom.GetRandomChar('A', 'Z'));
		System.out.println("0到9任意数字字符:" + MathRandom.GetRandomChar('0', '9'));
	}

}
