package ʵѵ�ڶ��ܿ�����ҵ;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019��5��20��
 */
public class Test04c {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������䣺");
			int age = scanner.nextInt();
			
		String[] str = {"��ͯ","����","������","����","׳��","����","������",
				"����","������","��������"};
		int n = age / 10;
		System. out. println("���Ǹ�" + str[n]);
	}

}
