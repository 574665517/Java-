package ʵѵ��һ�ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��15��
 */
public class Test01 {
	
	//�ж�������ż�ԣ�����flase��ż��true
	public static boolean isOdd(int i) {
		//return i % 2 == 1 || i % 2 == -1;
		return i % 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(isOdd(15));
		System.out.println(isOdd(10));
		System.out.println(isOdd(-1));
		System.out.println(isOdd(-2));
	}

}
