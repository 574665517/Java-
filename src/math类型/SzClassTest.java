/**
 *  @author ywx
 *  @ date 2019年12月28日
 */
package math类型;

/**
 * @author ywx
 * @ date 2019年12月28日
 */
public class SzClassTest {
	
	boolean Ma() {
		System.out.println("Ma被调用");
		return 1 == 2;
	}
	boolean Mb() {
		System.out.println("Mb被调用");
		return 1 == 1;
	}

	public static void main(String[] args) {
		SzClassTest sc = new SzClassTest();
		System.out.println(sc.Ma() && sc.Mb());

		SzClassTest sc1 = new SzClassTest();
		sc1 = null;
//		if((sc1 != null) && ("zs".equals(sc1.getName())));
		
		int a1 = 128;
		int b1 = 33;
		int c1 = a1 >> b1;//循环右移
		System.out.println(c1);
		
		int a = 10;
		System.out.println("a = " + a);//字符串拼接
		
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1.equals(n2));//equals比较智能用在引用类型
		
		String str1;
		str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);//false,字符串比较，不能等值比较
		System.out.println(str1.equals(str2));//true
		System.out.println(str1 == "Hello");//false
		System.out.println(str1.equals("Hello"));//true
		
	}

}

