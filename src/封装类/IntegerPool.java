package ��װ��;

import java.util.Scanner;
/**
 * new������Integer����new�����ľ���Ҫ����һ���µĶ�����Ϊ���������󣬵�ַ�϶���һ�������ԱȽϽ��Ϊfalse��������
 * @author ywx
 * @ date 2019��6��16��
 */

public class IntegerPool {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
		    int i = input.nextInt();
		    System.out.println("\n*********" + i + "������ж�**********");
		    // ����ͨ��new������integer����
		    Integer temp1 = new Integer(i);
		    Integer temp2 = new Integer(i);
		    System.out.println("new�����Ķ���" + (temp1 == temp2));

		    // ��������תΪ��װ���ͺ�Ƚ�
		    temp1 = i;
		    temp2 = i;
		    System.out.println("��������ת���Ķ���" + (temp1 == temp2));

		    // ͨ����̬��������һ��ʵ��
		    temp1 = Integer.valueOf(i);
		    temp2 = Integer.valueOf(i);
		    System.out.println("valueOf�����Ķ���" + (temp1 == temp2));
		}
	}
}
