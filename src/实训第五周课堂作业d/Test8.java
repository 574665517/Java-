package ʵѵ�����ܿ�����ҵd;

/**
 * ִ�����д��봴���˼�������,����x���ڶ��٣�X:104
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test8 {
	private static int x = 100;//��̬���������ö���������Ҳ��������������
	//����ʲô��x��ʲô����������ı�x
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Test8 hs1 = new Test8();
		hs1.x++;
		Test8 hs2 = new Test8();
		hs2.x++;
		hs1 = new Test8();
		hs1.x++;
		Test8.x++;
		System.out.println("X:" + x);
	}
}
