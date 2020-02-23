package 实训第二周课堂作业;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test04c {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
			int age = scanner.nextInt();
			
		String[] str = {"儿童","少年","青少年","青年","壮年","中年","中老年",
				"老年","老老年","老老老年"};
		int n = age / 10;
		System. out. println("你是个" + str[n]);
	}

}
