package ʵѵ��һ�ܿ�����ҵ;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019��5��15��
 */
public class Average02 {

	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.000");//����С�������λ:
		int i = 1;
		int num = 10;//�������
		double sum = 0;
		while (i <= num) {
			System.out.println("�������"+ i +" ���ɼ�: ");
			Scanner sc = new Scanner(System.in);
			double r = sc.nextDouble( );
			sum = r + sum;
			System.out.println("����ɼ�Ϊ��" + r);
			i++;
		}
		//DecimalFormat�ĸ�ʽ���ṹ��String���͵ģ���Ҫ���Ϊdouble��Ҫ�ٴ�ǿת
		System.out.println("ƽ���ɼ�Ϊ��" + df.format(sum / num));
	}

}
