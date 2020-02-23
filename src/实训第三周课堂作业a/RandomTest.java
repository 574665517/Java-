package 实训第三周课堂作业a;

import java.util.Random;

public class RandomTest {//将下面代码运行两遍以上,观察输出结果。
	/**
	 * 第1次：-1244746321
                第2次：1060493871
	       第3次：-1826063944
（1）java.util.Random类中实现的随机算法是伪随机，也就是有规则的随机，所谓有规则的就是在给定种(seed)的区间内随机生成数字； 
（2）相同种子数的Random对象，相同次数生成的随机数字是完全相同的； 
（3）Random类中各方法生成的随机数字都是均匀分布的，也就是说区间内部的数字生成的几率均等；
	 */
	public static void main(String[] args) {//随机种子一定，随机数范围一定，则单个对象单次运行的结果一定
		Random r = new Random();//去掉括号内的1000
		for (int i = 1; i < 4; i++) {
		    System.out.println("第" + i + "次：" + r.nextInt());
		}
	}
}
