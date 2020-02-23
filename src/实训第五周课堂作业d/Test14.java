package 实训第五周课堂作业d;

import java.math.BigInteger;

/**
 * 下面的程序计算结果正确吗？不正确
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test14 {
	/**
	 * ）不可变类：当你获得这个类的实例的引用之后，你不可以改变这个实例的内容。
	 * 比如：String，BigInteger，BigDecimal，Integer、Long、Short、Byte、Character、Boolean、Float和Double
	 * 还有基本数据类型的封装类，这些都是不可变类.不能修改它的值,不能修改现有实例的值，对这些类型的操作将返回新的实例
	 * @param args
	 */
	public static void main(String[] args) {//大整数操作方法
		BigInteger fiveThousand = new BigInteger("5000");//都是引用对象，只是地址值的传递
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		/**
		 * 就是因为你调用方法之后并不能改变这个对象的值。
		 */
//		total.add(fiveThousand);//返回一个BigInteger类型
//		total.add(fiftyThousand);
//		total.add(fiveHundredThousand);
		total = total.add(fiveThousand);//返回一个BigInteger类型
		total = total.add(fiftyThousand);
		total = total.add(fiveHundredThousand);
		System.out.println(total);
	}
}
