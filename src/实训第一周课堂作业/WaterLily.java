/**
 *  @author ywx
 *  @ date 2018��8��1��
 */
package ʵѵ��һ�ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��16��
 */
public class WaterLily {

	/**
	 * ��ӡˮ�ɻ�����153 = 1^3 + 5^3 + 3^3
	 * @param args
	 */
	public static void main(String[] args) {
		int a1,a2,a3;//��λ��ʮλ����λ
		for(int i = 101;i < 1000;i++) {
			a3 = i / 100;
			a2 = i % 100 / 10;
			a1 = i % 10;
			if(a3 * a3 * a3 + a2 * a2 * a2 + a1 * a1 * a1 == i) {
				System.out.println(i + "�Ǹ�ˮ�ɻ���");
			}
		}
	}

}
