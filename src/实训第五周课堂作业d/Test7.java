package 实训第五周课堂作业d;

/**
 * 执行后返回的是true还是false。 flase
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test7 {
	public static void main(String[] args) {
		System.out.println(findResult());
	}
	@SuppressWarnings("finally")
	private static boolean findResult() {//不管结果如何最后都会执行finally
		try {
			return true;
		} catch (Exception e) {
			return true;
		} finally {
			return false;
		}
	}
}
