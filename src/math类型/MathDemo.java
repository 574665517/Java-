package math����;

public class MathDemo {
	/**
	 * ��� ȡһ��1*1��������������һ���뾶Ϊ1��Բ ��һ��ζ�������Բ�ڵĸ��ʵ������֮��
	 * @param args
	 */
	public static void main(String[] args) {
		double maxCount = 10000;
		int count = 0;
		for (int i = 1; i < maxCount; i++) {
			double x = Math.random();
			double y = Math.random();
			if (Math.hypot(x, y) <= 1) {
				count++;
			}
		}
		System.out.println("PI =" + 4 * count / maxCount);

	}

}
