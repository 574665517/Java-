package ʵѵ�����ܿ�����ҵd;

/**
 * ִ�к󷵻ص���true����false�� flase
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test7 {
	public static void main(String[] args) {
		System.out.println(findResult());
	}
	@SuppressWarnings("finally")
	private static boolean findResult() {//���ܽ�������󶼻�ִ��finally
		try {
			return true;
		} catch (Exception e) {
			return true;
		} finally {
			return false;
		}
	}
}
