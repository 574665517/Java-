package ʵѵ�ڶ��ܿ�����ҵa;

import java.util.Random;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test2 {
	//��������䣬Ȼ�����������䣬���Ǳ�����
	//�����ǵ�һ�θ�ֵ��֮�󲻻�仯
	public static void main(String[] args) {
		System.out.println("����ֵ��" + Const.RAND_CONST);
	}

	/* �ӿڳ��� */
	interface Const {
	//������
	public static final int RAND_CONST = new Random().nextInt();
	}
	
}
