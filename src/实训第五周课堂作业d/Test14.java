package ʵѵ�����ܿ�����ҵd;

import java.math.BigInteger;

/**
 * ����ĳ����������ȷ�𣿲���ȷ
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test14 {
	/**
	 * �����ɱ��ࣺ������������ʵ��������֮���㲻���Ըı����ʵ�������ݡ�
	 * ���磺String��BigInteger��BigDecimal��Integer��Long��Short��Byte��Character��Boolean��Float��Double
	 * ���л����������͵ķ�װ�࣬��Щ���ǲ��ɱ���.�����޸�����ֵ,�����޸�����ʵ����ֵ������Щ���͵Ĳ����������µ�ʵ��
	 * @param args
	 */
	public static void main(String[] args) {//��������������
		BigInteger fiveThousand = new BigInteger("5000");//�������ö���ֻ�ǵ�ֵַ�Ĵ���
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		/**
		 * ������Ϊ����÷���֮�󲢲��ܸı���������ֵ��
		 */
//		total.add(fiveThousand);//����һ��BigInteger����
//		total.add(fiftyThousand);
//		total.add(fiveHundredThousand);
		total = total.add(fiveThousand);//����һ��BigInteger����
		total = total.add(fiftyThousand);
		total = total.add(fiveHundredThousand);
		System.out.println(total);
	}
}
