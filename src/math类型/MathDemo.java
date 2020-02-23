package math类型;

public class MathDemo {
	/**
	 * 求π 取一个1*1的正方形里面有一个半径为1的圆 丢一万次豆子求在圆内的概率等于面积之比
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
