package ʵѵ�ڶ��ܿ�����ҵ;

import java.util.Scanner;

/**
 * ����һ�����������䣬�Ϳ����жϳ������ĸ�����ε���
 * @author ywx
 * @ date 2019��5��20��
 */
public class Test04a {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������䣺");
			int age = scanner.nextInt();
			if (age < 9) {
				System.out.println("���Ǹ���ͯ");
			} else if (age < 19) {
				System.out.println("���Ǹ�����");
			} else if (age < 29) {
				System.out.println("���Ǹ�������");
			} else if (age < 39) {
				System.out.println("���Ǹ�����");
			} else if (age < 49) {
				System.out.println("���Ǹ�׳��");
			} else if (age < 59) {
				System.out.println("���Ǹ�����");
			} else if (age < 69) {
				System.out.println("���Ǹ�������");
			} else if (age < 79) {
				System.out.println("���Ǹ�����");
			} else if (age < 89) {
				System.out.println("���Ǹ�������");
			} else if (age < 99) {
				System.out.println("���Ǹ�������");
			}
	}

}
