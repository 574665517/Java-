package ʵѵ��һ�ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��15��
 */
public class Average {
//	private static int num = 10;
//	private static double scores[] = new double[10];

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			double stu = (double) (Math.random() * 100);
			sum += stu;
			System.out.println("��" + (i + 1)+ "ѧ���ɼ�" + stu);
		}
		System.out.println("ƽ���ɼ��ǣ�" + (float)(sum / 10));
	}

}
