package ʵѵ�ڶ��ܿ�����ҵ;

import java.util.Scanner;

/**
 * ���˹�˾�н��û����˻�����ʱ,����ݻ�����̸��ͻ�һ�����Ż��ۿۡ�
 �����������500km��������500km������ʱ,û���ۿ�(discount)��
�����������1000km��������1000km������ʱ,����ͻ�5%���˷ѣ�
�����������1500km��������1500km������ʱ,����ͻ�8%���˷ѣ�
�����������2500km��������2500km������ʱ,����ͻ�10%���˷ѣ�
��������̳���2500kmʱ������ͻ�12%���˷ѡ�
�����û���������weight���������dist����λ�˷�fee��ÿ�ֹ����˷ѣ�����̼����û�Ӧ֧�����˷�
 * @author ywx
 * @ date 2019��5��20��
 */
public class Test02a {
	
	private static double fee = 10.0;//ÿ�ֹ����˷�
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		double sum = 0.0;//�û�Ӧ��֧�����˷�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����������");
		Double weight = scanner.nextDouble();//�����û���������
		while (true) {
			System.out.println("�������û�������̣�");
			Double dist = scanner.nextDouble();//�������
			if (dist < 500) {
				System.out.println("û���ۿ�");
				sum = dist * fee * weight;
			} else if (dist < 1000) {
				System.out.println("����ͻ�5%���˷�");
				sum = dist * fee * weight * 0.95;
			} else if (dist < 1500) {
				System.out.println("����ͻ�8%���˷�");
				sum = dist * fee * weight * 0.92;
			} else if (dist < 2500) {
				System.out.println("����ͻ�10%���˷�");
				sum = dist * fee * weight * 0.90;
			} else {
				System.out.println("����ͻ�12%���˷�");
				sum = dist * fee * weight * 0.88;
			}
			System.out.println("�û�����" + sum + "Ԫ�˷�");
		}
			
	}

}
