package ʵѵ�����ܿ�����ҵa;

import java.util.Scanner;

public class MaxNumberTest {//�������ڿ���̨����2147483647����ô�������Ѿ��ɹ�Ԥ����2147483647����Ʒ��
	//����������������ֵ��һ��Ҫ���Ǳ߽磬�����߽磬�ͻ����
	// һ����Աӵ�в�Ʒ���������
	public final static int LIMIT = 2000;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	// ��Ա��ǰӵ�еĲ�Ʒ����
		int cur = 1000;
		Scanner input = new Scanner(System.in);
		System.out.print("��������ҪԤ����������");
		while (input.hasNextInt()) {
			int order = input.nextInt();
			// ��ǰӵ�е���׼�������Ĳ�Ʒ����֮��
			if (order > 0 && order + cur <= LIMIT) {
			    System.out.println("���Ѿ��ɹ�Ԥ����" + order + "����Ʒ��");
	        } else {
				System.out.println("�����޶Ԥ��ʧ�ܣ�");
	        }
	}
	}
}
