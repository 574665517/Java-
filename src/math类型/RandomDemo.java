/**
 *  @author ywx
 *  @ date 2018年8月9日
 */
package math类型;

import java.util.Random;

/**
 * 使用Random类，创建该类对象并生成各种类型随机数
 * @author ywx
 * @ date 2018年8月9日
 */
public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();//实例化一个Random类
		//随机产生一个整数
		System.out.println("随机产生一个整数："+ r.nextInt());
		//随机产生一个大于等于0且小于等于10的整数
		System.out.println("随机产生一个大于等于0且小于等于10的整数："+ r.nextInt(10));
		//随机产生一个布尔型的值
		System.out.println("随机产生一个布尔型的值："+ r.nextBoolean());
		//随机产生一个双精度型的值
		System.out.println("随机产生一个双精度型的值："+ r.nextDouble());
		//随机产生一个浮点类型的值
		System.out.println("随机产生一个浮点类型的值："+ r.nextFloat());
		//随机产生一个概率密度为高斯分布的双精度值
		System.out.println("随机产生一个概率密度为高斯分布的双精度值："+ r.nextGaussian());
	}

}
