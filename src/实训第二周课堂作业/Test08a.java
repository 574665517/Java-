package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test08a {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time :" + (end - start));
	}

}
