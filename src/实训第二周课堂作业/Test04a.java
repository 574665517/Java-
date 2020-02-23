package 实训第二周课堂作业;

import java.util.Scanner;

/**
 * 任意一个人输入年龄，就可以判断出他是哪个年龄段的人
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test04a {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
			int age = scanner.nextInt();
			if (age < 9) {
				System.out.println("你是个儿童");
			} else if (age < 19) {
				System.out.println("你是个少年");
			} else if (age < 29) {
				System.out.println("你是个青少年");
			} else if (age < 39) {
				System.out.println("你是个青年");
			} else if (age < 49) {
				System.out.println("你是个壮年");
			} else if (age < 59) {
				System.out.println("你是个中年");
			} else if (age < 69) {
				System.out.println("你是个中老年");
			} else if (age < 79) {
				System.out.println("你是个老年");
			} else if (age < 89) {
				System.out.println("你是个老老年");
			} else if (age < 99) {
				System.out.println("你是个老老年");
			}
	}

}
