package ʵѵ�����ܿ�����ҵ;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019��6��1��
 */
public enum Season {
	// �ڵ�һ����ʽ���г�4��ö��ʵ��(ö��ֵ)��ϵͳ���Զ���� public static final ����
	Spring, Summer, Autumn, Winter;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int input = scanner.nextInt();
		if(input > 12 && input < 1) {
			System.out.println("û�д��·�");
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
