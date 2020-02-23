package 实训第六周课堂作业;

import java.util.Random;

/**
 * @author ywx
 * @ date 2019年6月17日
 */
public class StreamNullTest {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		int[] num = new int[10000];//设计一个数组来装10000个数
		Random random = new Random();//随机生成一个数字
		int temp = 0;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			temp = random.nextInt(100);
			if(temp >= 85) {
				System.out.println(temp);
				count++;
			}
		}
		System.out.println("共有" + count + "学生成绩大于85");
		
		long end = System.currentTimeMillis();
		System.out.println("普通运算需要的时间:" + (end - begin));
	}

}
