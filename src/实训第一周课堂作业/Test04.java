package 实训第一周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月16日
 */
public class Test04 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start: " + start);
		int i, sum = 0,count = 0;
		for(i = 1; i < 10000; i++) {
			if(i % 7 == 0) {
			sum += i;
			System.out.println("所有的7的倍数数分别为：" + i);
			count++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("time :" + (end - start));
		
		System.out.println("打印1~10000之间所有是7的倍数的整数的个数:" + count);
		System.out.println("总和  = " + sum);
	}

}
