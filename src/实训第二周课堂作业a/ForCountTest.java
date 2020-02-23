package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class ForCountTest {

	public static void main(String[] args) {
		/**
		 * +=, -=， *=， /= 自带强制类型转换
		 */
		for (int i = 0; i < 10; i++) {
			//i *= 0.1;//自带强制类型转换，浮点数强制转成整数，去掉小数部分，只留整数部分
			//i = i * 0.1;//会要强制类型转换
			System.out.println("i的值 = " + i);
		}
		
	}

}
