package ʵѵ��һ�ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��16��
 */
public class Test03 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start: " + start);
		int i, sum = 0;
		for(i = 1; i < 1000; i = i + 2) {
			sum += i;
			System.out.println("���е������ֱ�Ϊ��" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time :" + (end - start));
		
		System.out.println("�ܺ�  = " + sum);
	}

}
