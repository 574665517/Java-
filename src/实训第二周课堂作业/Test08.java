package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test08 {
	
	public static int f(int n) {
		int b = n != 1 ? f(--n) + 1 : 1;
		System.out.println(b);
		return b;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		f(1000);
		long end = System.currentTimeMillis();
		System.out.println("time :" + (end - start));
	}

}
