/**
 *  @author ywx
 *  @ date 2019��12��28��
 */
package math����;

/**
 * @author ywx
 * @ date 2019��12��28��
 */
public class SzClassTest {
	
	boolean Ma() {
		System.out.println("Ma������");
		return 1 == 2;
	}
	boolean Mb() {
		System.out.println("Mb������");
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
		int c1 = a1 >> b1;//ѭ������
		System.out.println(c1);
		
		int a = 10;
		System.out.println("a = " + a);//�ַ���ƴ��
		
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1.equals(n2));//equals�Ƚ�����������������
		
		String str1;
		str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);//false,�ַ����Ƚϣ����ܵ�ֵ�Ƚ�
		System.out.println(str1.equals(str2));//true
		System.out.println(str1 == "Hello");//false
		System.out.println(str1.equals("Hello"));//true
		
	}

}

