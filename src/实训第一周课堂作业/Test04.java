package ʵѵ��һ�ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��16��
 */
public class Test04 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start: " + start);
		int i, sum = 0,count = 0;
		for(i = 1; i < 10000; i++) {
			if(i % 7 == 0) {
			sum += i;
			System.out.println("���е�7�ı������ֱ�Ϊ��" + i);
			count++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("time :" + (end - start));
		
		System.out.println("��ӡ1~10000֮��������7�ı����������ĸ���:" + count);
		System.out.println("�ܺ�  = " + sum);
	}

}
