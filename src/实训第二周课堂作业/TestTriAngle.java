package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��22��
 */
public class TestTriAngle {

	public static void main(String[] args) {
		int base = 2, height = 3;//���õױ߳��͸�
		TriAngle t = new TriAngle(base, height);
		int t1 = t.calculateArea();
		System.out.println(t1);
	}

}
