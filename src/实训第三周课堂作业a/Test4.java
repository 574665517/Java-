package ʵѵ�����ܿ�����ҵa;

//import java.math.BigDecimal;

/**
 * ����float��double������̫����
 * @author ywx
 * @ date 2019��5��31��
 */
public class Test4 {//Ϊʲô��ʾʣ�������֣�ʣ����:3000.3008
	public static void main(String[] args) {
		Float totalMeoney = 20000.8f;
		Float ownMeoney = 17000.5f;
		Float leftMeoney = totalMeoney - ownMeoney;
		//���float�Ķ����йأ���λ���ﵽһ���ĸ����󣬻����ÿ�ѧ��������ʾ��
		System.out.println("ʣ����:" + leftMeoney.intValue());
		//System.out.println((new BigDecimal(totalMeoney)).subtract(new BigDecimal(ownMeoney)).toBigInteger());
	}
}
