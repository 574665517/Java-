package ʵѵ�����ܿ�����ҵd;

/**
 * ���ܲ�ͨ��IDEִ��д�ɳ���ӡ����Ϣ��ABDCBDCB
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test13 {
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); foo('B') && (i < 2); foo('C')) {
			i++;
			foo('D');
		}
	}
}
