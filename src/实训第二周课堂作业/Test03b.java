package ʵѵ�ڶ��ܿ�����ҵ;

import java.util.Scanner;

/**
 *  �ڲ�ͬ�¶�ʱ��ʾ��ͬ�Ľ���˵��,�ӿ���̨�����¶�ֵ��
���¶�С��10�� ��ʾ: 10���е��䡣Ҫ�ഩ�·���
���¶�С��25�� ��ʾ: 23�������ʡ���ȥ��ɣ�
���¶ȴ���25�� С��35�� ��ʾ: 30���е��ȣ�
���¶ȴ���35�� ��ʾ: 39��̫����!���յ���
 * @author ywx
 * @ date 2019��5��20��
 */
public class Test03b {

	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("�����ǰ�¶�С��10�ȣ�������1"
		 		+ "�����ǰ�¶�С��25�ȣ�������2"
		 		+ "�����ǰ�¶ȴ���25��С��35�ȣ�������3"
		 		+ "�����ǰ�¶ȴ���35�ȣ�������4");
		 int temperature = scanner.nextInt();
			switch (temperature) {
			case 1:
				System.out.println(temperature + "���е��䡣Ҫ�ഩ�·���");
				break;
			case 2:
				System.out.println(temperature + "�������ʡ���ȥ��ɣ�");
				break;
			case 3:
				System.out.println(temperature + "���е��ȣ�");
				break;
			case 4:
				System.out.println(temperature + "��̫����!���յ���");
				break;
			}
	}

}
