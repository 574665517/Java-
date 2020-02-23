package 实训第三周课堂作业;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年6月1日
 */
public enum Season {
	// 在第一行显式地列出4个枚举实例(枚举值)，系统会自动添加 public static final 修饰
	Spring, Summer, Autumn, Winter;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int input = scanner.nextInt();
		if(input > 12 && input < 1) {
			System.out.println("没有此月份");
		} else if(input >= 3 && input <= 5) {
			System.out.println(Season.Spring);
		} else if(input >= 6 && input <= 8) {
			System.out.println(Season.Summer);
		} else if(input >= 9 && input <= 11) {
			System.out.println(Season.Autumn);
		} else if(input == 12 || input == 1 || input == 2) {
			System.out.println(Season.Winter);
		}
	}
}
