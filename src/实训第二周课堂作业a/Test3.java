package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test3 {

	//��Ŀ�������ǰ�������ͣ�������ʽ���и����������Ҳ�Ǹ�������
	public static void main(String[] args) {
		int i = 80;
		String s = String.valueOf(i < 100 ? 90 : 100);
		//String s1 = String.valueOf(i < 100 ? 90 : 100.0);
		String s1 = String.valueOf(i < 100 ? 90 : 100);
		System.out.println("�����Ƿ���ȣ�" + s.equals(s1));
	}

}
