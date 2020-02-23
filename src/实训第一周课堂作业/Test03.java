package 实训第一周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月16日
 */
public class Test03 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start: " + start);
		int i, sum = 0;
		for(i = 1; i < 1000; i = i + 2) {
			sum += i;
			System.out.println("所有的奇数分别为：" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time :" + (end - start));
		
		System.out.println("总和  = " + sum);
	}

}
