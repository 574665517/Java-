package string类型;

/**
 * @author ywx
 * @ date 2019年5月20日
 */
public class DoTheMath {

	public static void main(String[] args) {
		int x = 3510 / 1000 * 1000;
		System.out.println(x);
		System.out.println("5 + 5 = " + 5 + 5);
		System.out.println('*' + '\t' +'*');
		System.out.println("*" + '\t' +'*');
		int x1 = 3 ;
		// 3的二进制数据：00000000 00000000 00000000 00000011
		System.out.println(x1 + "左移2位之后的内容：" + (x1 << 2));
		int x2 = 3 ;
		// 3的二进制数据：00000000 00000000 00000000 00000011
		int y = -3 ;
		// -3的二进制数据：11111111 11111111 11111111 11111101
		System.out.println(x2 + "右移2位之后的内容：" + (x2 >> 2));
		System.out.println(y + "右移2位之后的内容：" + (y >> 2));
		int x3 = 3 ;
		// 3的二进制数据：00000000 00000000 00000000 00000011
		int y1 = -3 ;
		// -3的二进制数据：11111111 11111111 11111111 11111101
		System.out.println(x3 + "右移2位之后的内容：" + (x3 >>> 2));
		System.out.println(y1 + "右移2位之后的内容：" + (y1 >>> 2));
	}

}
