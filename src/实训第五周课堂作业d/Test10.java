package ʵѵ�����ܿ�����ҵd;

/**
 * ���д�������������ǣ�AB,B
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test10 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer ("A");
		StringBuffer b = new StringBuffer ("B");
		operate(a,b);
		System.out.println(a + "," + b);
	}
	private static void operate(StringBuffer x, StringBuffer y) {//ֵ���ݣ���ȥ֮����˭����˭
		x.append(y);//x = xy
		y = x;//x�ĵ�ַ����y
	}
}
