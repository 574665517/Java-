package 实训第二周课堂作业;

import java.util.Scanner;

/**
 * 货运公司承接用户的运货请求时,会根据货运里程给客户一定的优惠折扣。
 当货运里程在500km（不包括500km）以内时,没有折扣(discount)；
当货运里程在1000km（不包括1000km）以内时,减免客户5%的运费；
当货运里程在1500km（不包括1500km）以内时,减免客户8%的运费；
当货运里程在2500km（不包括2500km）以内时,减免客户10%的运费；
当货运里程超过2500km时，减免客户12%的运费。
给定用户货物重量weight、货运里程dist及单位运费fee（每吨公里运费），编程计算用户应支付的运费
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test02a {
	
	private static double fee = 10.0;//每吨公里运费
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		double sum = 0.0;//用户应该支付的运费
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户行李质量：");
		Double weight = scanner.nextDouble();//输入用户行李质量
		while (true) {
			System.out.println("请输入用户货物里程：");
			Double dist = scanner.nextDouble();//输入里程
			if (dist < 500) {
				System.out.println("没有折扣");
				sum = dist * fee * weight;
			} else if (dist < 1000) {
				System.out.println("减免客户5%的运费");
				sum = dist * fee * weight * 0.95;
			} else if (dist < 1500) {
				System.out.println("减免客户8%的运费");
				sum = dist * fee * weight * 0.92;
			} else if (dist < 2500) {
				System.out.println("减免客户10%的运费");
				sum = dist * fee * weight * 0.90;
			} else {
				System.out.println("减免客户12%的运费");
				sum = dist * fee * weight * 0.88;
			}
			System.out.println("用户花了" + sum + "元运费");
		}
			
	}

}
