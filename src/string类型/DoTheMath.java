package string����;

/**
 * @author ywx
 * @ date 2019��5��20��
 */
public class DoTheMath {

	public static void main(String[] args) {
		int x = 3510 / 1000 * 1000;
		System.out.println(x);
		System.out.println("5 + 5 = " + 5 + 5);
		System.out.println('*' + '\t' +'*');
		System.out.println("*" + '\t' +'*');
		int x1 = 3 ;
		// 3�Ķ��������ݣ�00000000 00000000 00000000 00000011
		System.out.println(x1 + "����2λ֮������ݣ�" + (x1 << 2));
		int x2 = 3 ;
		// 3�Ķ��������ݣ�00000000 00000000 00000000 00000011
		int y = -3 ;
		// -3�Ķ��������ݣ�11111111 11111111 11111111 11111101
		System.out.println(x2 + "����2λ֮������ݣ�" + (x2 >> 2));
		System.out.println(y + "����2λ֮������ݣ�" + (y >> 2));
		int x3 = 3 ;
		// 3�Ķ��������ݣ�00000000 00000000 00000000 00000011
		int y1 = -3 ;
		// -3�Ķ��������ݣ�11111111 11111111 11111111 11111101
		System.out.println(x3 + "����2λ֮������ݣ�" + (x3 >>> 2));
		System.out.println(y1 + "����2λ֮������ݣ�" + (y1 >>> 2));
	}

}
