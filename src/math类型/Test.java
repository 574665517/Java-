package math����;

public class Test {

	public static void main(String[] args) {
		/**\
		 * �Ǿ�̬������һ������ͬ��֮�����Ҫ���������ٵ���
		 */
		MathRandom g1 = new MathRandom();
		System.out.println("����һ��2-23��֮���ż��:" + g1.GetEvenNum(2, 23));
		/**
		 * ��̬������һ������ͬ��֮����� ����.������
		 */
		System.out.println("����Сд�ַ�:" + MathRandom.GetRandomChar('a', 'z'));
		System.out.println("�����д�ַ�:" + MathRandom.GetRandomChar('A', 'Z'));
		System.out.println("0��9���������ַ�:" + MathRandom.GetRandomChar('0', '9'));
	}

}
