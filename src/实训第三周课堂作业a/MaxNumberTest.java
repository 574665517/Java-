package 实训第三周课堂作业a;

import java.util.Scanner;

public class MaxNumberTest {//当我们在控制台输入2147483647会怎么样？你已经成功预定的2147483647个产品！
	//这个数是整数的最大值，一定要考虑边界，超出边界，就会溢出
	// 一个会员拥有产品的最多数量
	public final static int LIMIT = 2000;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	// 会员当前拥有的产品数量
		int cur = 1000;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入需要预定的数量：");
		while (input.hasNextInt()) {
			int order = input.nextInt();
			// 当前拥有的与准备订购的产品数量之和
			if (order > 0 && order + cur <= LIMIT) {
			    System.out.println("你已经成功预定的" + order + "个产品！");
	        } else {
				System.out.println("超过限额，预订失败！");
	        }
	}
	}
}
