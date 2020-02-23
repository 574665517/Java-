package 变量final;

import java.util.Random;

public class FinalStaticData {
	private static Random rand = new Random();
	private final int a1 = rand.nextInt(10); // 随机产生0-10之间的随机数赋予定义为final的a1
	private static final int a2 = rand.nextInt(10); // 随机产生0-10之间的随机数赋予定义为final的a2

	/**
	 * 声明为static final形式，所以在内存中为a2开辟了一个恒定不变的区域，
	 * 当再次实例化一个对象时，仍然指向a2这块内存区域，所以a2值保持不变
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		FinalStaticData f = new FinalStaticData();
		System.out.println("重新实例化对象调用a1的值：" + f.a1);
		System.out.println("重新实例化对象调用a1的值：" + f.a2);
		FinalStaticData f2 = new FinalStaticData();
		System.out.println("重新实例化对象调用a1的值：" + f2.a1);
		System.out.println("重新实例化对象调用a2的值：" + f2.a2);
	}

}
