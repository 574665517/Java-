/**
 *  @author ywx
 *  @ date 2019年3月6日
 */
package 软件测试;
/**
 * 白盒测试
 */

import java.util.Scanner;

public class WhiteTest02 {
	
	private static double sum = 0.0;//行李费
	
	private static double kg = 0.0;//行李质量
	
	public void cabin(String people, String cabin, String dis) {
		
		
//		double kg = 0.0;//超过30kg的行李重量
		
		while (true) {// 死循环
			Scanner kg1 = new Scanner(System.in);
			System.out.println("请输入行李重量：       ");
			Double kg = kg1.nextDouble();
			Double kgg = Math.ceil(kg);
			int kgcopy = kgg.intValue();
			
//			if(kgcopy != kg) {
//				kgcopy = kgcopy + 1;
//			}
//			
			if (kg <= 30.0) {
				System.out.println("行李没有超过30kg，不需要额外费用");
			} else {
				if ("1".equals(people)) {
					if ("3".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 4;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 2;
						} 
					} else if ("4".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 6;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 3;
						}
					}
				} else if ("2".equals(people)) {
					if ("3".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 8;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 4;
						} 
					} else if ("4".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 12;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 6;
						}
					}
				}
				System.out.println("行李的重量" + kgcopy);
				System.out.println("花了" + sum + "元行李费");
			}
			
//		if(x.nextDouble() <= 30.0) {//乘客行李重量低于三十kg
//			System.out.println("不需要额外费用");
//		} else {
//			System.out.println("请输入您是中国乘客还是外国乘客:" + people);
//			System.out.println("请输入您的舱位:" + cabin);
//			System.out.println("请输入您是正常人还是残疾人:" + dis);
//			if (people.equals("中国乘客")) {
//				if(cabin.equals("头等舱")) {
//					if(dis.equals("正常人")) {
//						sum = (kg - 30) * 4;
//					}
//					sum = (kg - 30) * 2;
//				} else {
//					if(dis.equals("正常人")) {
//						sum = (kg - 30) * 6;
//					}
//					sum = (kg - 30) * 3;
//				}
//			} else if (people.equals("外国乘客")){
//				if(cabin.equals("头等舱")) {
//					if(dis.equals("正常人")) {
//						sum = (kg - 30) * 8;
//					}
//					sum = (kg - 30) * 4;
//				} else {
//					if(dis.equals("正常人")) {
//						sum = (kg - 30) * 12;
//					}
//					sum = (kg - 30) * 6;
//				}
//			}
//
//		}	
//		System.out.println("行李超过标准30kg" + kg);
//		System.out.println("花了" + sum + "行李费");
	}
}
	
	public double getSum() {
	    return sum;
    }
	
	public double getKg() {
	    return kg;
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("中国乘客选1，外国乘客选2       ");
		String people = scanner.next();
		
		//Scanner cabin = new Scanner(System.in);
		
		Scanner cabin1 = new Scanner(System.in);
		System.out.print("头等舱乘客选3，其他舱乘客选4       ");
		String cabin = cabin1.next();
		
		Scanner dis1 = new Scanner(System.in);
		System.out.print("正常乘客选5，残疾乘客选6       ");
		String dis = dis1.next();
		
		WhiteTest02 t = new WhiteTest02();
		t.cabin(people, cabin, dis);
	}

}
