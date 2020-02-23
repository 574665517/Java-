package 实训第一周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月15日
 */
public class Test01 {
	
	//判断整数奇偶性，奇数flase，偶数true
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
