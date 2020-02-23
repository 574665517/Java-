package 实训第二周课堂作业a;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class IfErrorTest {
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入年龄：");
		int age = input.nextInt();
		if (age >= 60) {
		System.out.println("老年人");
		} else if (age >= 40) {
		System.out.println("中年人");
		} else if (age >= 20) {
		System.out.println("青年人");
		} else {
			System.out.println("青少年");
		}
	}

}
