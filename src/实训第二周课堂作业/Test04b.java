package 实训第二周课堂作业;

import java.util.Scanner;

/**
 * 任意一个人输入年龄，就可以判断出他是哪个年龄段的人
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test04b {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的年龄段的十位数：");
			int age = scanner.nextInt();
			switch (age) {
			case 0:
				System.out.println("你是个儿童");
			case 1:
				System.out.println("你是个少年");
			case 2:
				System.out.println("你是个青少年");
			case 3:
				System.out.println("你是个青年");
			case 4:
				System.out.println("你是个壮年");
			case 5:
				System.out.println("你是个中年");
			case 6:
				System.out.println("你是个中老年");
			case 7:
				System.out.println("你是个老年");
			case 8:
				System.out.println("你是个老老年");
			case 9:
				System.out.println("你是个老老老年");
	}
	}

}
