package ʵѵ�����ܿ�����ҵd;

/**
 * �������ִ�н����ӡ���ǣ� ��
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test6 {
	static final int END = Integer.MAX_VALUE;//END���������ֵ�����κμӷ�ʱ�򶼻����
	static final int START = END - 100;
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = START; i <= END; i++) {
			count++;
		}
		System.out.println(count);
	}
}
