package ʵѵ�ڶ��ܿ�����ҵ;

import java.util.Scanner;

/**
 * �ڲ�ͬ�¶�ʱ��ʾ��ͬ�Ľ���˵��,�ӿ���̨�����¶�ֵ��
���¶�С��10�� ��ʾ: 10���е��䡣Ҫ�ഩ�·���
���¶�С��25�� ��ʾ: 23�������ʡ���ȥ��ɣ�
���¶ȴ���25�� С��35�� ��ʾ: 30���е��ȣ�
���¶ȴ���35�� ��ʾ: 39��̫����!���յ���
 * @author ywx
 * @ date 2019��5��20��
 */
public class Test03a {
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뵱ǰ�¶ȣ�");
		int temperature = scanner.nextInt();
		
			if (temperature < 10) {
				System.out.println(temperature + "���е��䡣Ҫ�ഩ�·���");
			} else if (temperature < 25) {
				System.out.println(temperature + "�������ʡ���ȥ��ɣ�");
			} else if (temperature < 35) {
				System.out.println(temperature + "���е��ȣ�");
			} else {
				System.out.println(temperature + "��̫����!���յ���");
			}
		}

}
