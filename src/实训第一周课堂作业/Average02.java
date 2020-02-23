package 实训第一周课堂作业;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年5月15日
 */
public class Average02 {

	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.000");//保留小数点后三位:
		int i = 1;
		int num = 10;//输入个数
		double sum = 0;
		while (i <= num) {
			System.out.println("请输入第"+ i +" 个成绩: ");
			Scanner sc = new Scanner(System.in);
			double r = sc.nextDouble( );
			sum = r + sum;
			System.out.println("输入成绩为：" + r);
			i++;
		}
		//DecimalFormat的格式化结构是String类型的，想要结果为double需要再次强转
		System.out.println("平均成绩为：" + df.format(sum / num));
	}

}
