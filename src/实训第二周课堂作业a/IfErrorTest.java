package ʵѵ�ڶ��ܿ�����ҵa;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class IfErrorTest {
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������䣺");
		int age = input.nextInt();
		if (age >= 60) {
		System.out.println("������");
		} else if (age >= 40) {
		System.out.println("������");
		} else if (age >= 20) {
		System.out.println("������");
		} else {
			System.out.println("������");
		}
	}

}
