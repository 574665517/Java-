package 封装类;

import java.util.Scanner;
/**
 * new产生的Integer对象：new声明的就是要生成一个新的对象，因为是两个对象，地址肯定不一样，所以比较结果为false毫无疑问
 * @author ywx
 * @ date 2019年6月16日
 */

public class IntegerPool {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
		    int i = input.nextInt();
		    System.out.println("\n*********" + i + "的相等判断**********");
		    // 两个通过new产生的integer对象
		    Integer temp1 = new Integer(i);
		    Integer temp2 = new Integer(i);
		    System.out.println("new产生的对象：" + (temp1 == temp2));

		    // 基本类型转为包装类型后比较
		    temp1 = i;
		    temp2 = i;
		    System.out.println("基本类型转换的对象：" + (temp1 == temp2));

		    // 通过静态方法生成一个实例
		    temp1 = Integer.valueOf(i);
		    temp2 = Integer.valueOf(i);
		    System.out.println("valueOf产生的对象：" + (temp1 == temp2));
		}
	}
}
