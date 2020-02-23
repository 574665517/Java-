package math����;

import java.math.BigDecimal;

public class BigDecimalDemo {
	static final int location = 10;

	/**
	 * ����ӷ�����������Ϊ�����뱻����
	 * @param value1
	 * ��ӵĵ�һ����
	 * @param value2
	 * ��ӵĵڶ�����
	 * @return ����֮��
	 */
	
	public BigDecimal add(double value1,double value2) {
		//ʵ����Decimal����
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	
	/**
	 * �����������������Ϊ�����뱻����
	 * @param value1
	 * ������
	 * @param value2
	 * ����
	 * @return ������
	 */
	public BigDecimal sub(double value1,double value2) {
		//ʵ����Decimal����
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);//���ü�������
	}
	
	/**
	 * ����˷�����������Ϊ�����뱻����
	 * @param value1
	 * ��һ������
	 * @param value2
	 * �ڶ�������
	 * @return ������
	 */
	public BigDecimal mul(double value1,double value2) {
		//ʵ����Decimal����
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}
	
	/**
	 * �����������������Ϊ�����뱻����
	 * @param value1
	 * ������
	 * @param value2
	 * ����
	 * @return ������
	 */
	
	public BigDecimal div(double value1, double value2) {
		return div(value1, value2, location);
	}
	public BigDecimal div(double value1, double value2, int b) {
		if (b < 0) {
			System.out.println("bֵ������ڵ���0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		//���ó��Ƿ�������С�������bλ������������������������
		return b1.divide(b2,b,BigDecimal.ROUND_HALF_UP);
	}
	public static void main(String[] args) {
		BigDecimalDemo b = new BigDecimalDemo();
		System.out.println("����������ӵĽ���ǣ�" + b.add(-7.5, 8.9));
        System.out.println("������������Ľ���ǣ�" + b.sub(-7.5, 8.9));
        System.out.println("����������˵Ľ���ǣ�" + b.mul(-7.5, 8.9));
        System.out.println("������������Ľ�������С������10λ" + b.div(10,2));
        System.out.println("�����������������С����5λ" + b.div(-7.5, 8.9, 5));
	}

}
