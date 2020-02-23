package 实训第一周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月15日
 */
public class Average {
//	private static int num = 10;
//	private static double scores[] = new double[10];

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			double stu = (double) (Math.random() * 100);
			sum += stu;
			System.out.println("第" + (i + 1)+ "学生成绩" + stu);
		}
		System.out.println("平均成绩是：" + (float)(sum / 10));
	}

}
