package math类型;

public class MathRandom {
	/**
	 * 定义产生偶数的方法
	 * 
	 * @param num1
	 *            起始范围参数
	 * @param num2
	 *            终止范围参数
	 * @return 随机的范围的偶数
	 */
	public int GetEvenNum(int num1, int num2) {
		// 产生num1到num2之间的随机数
		int s = (int) num1 + (int) (Math.random() * (num2 - num1));
		if (s % 2 == 0) {
			return s;
		} else {
			return s + 1;
		}
	}

	public static char GetRandomChar(char cha1, char cha2) {
		return (char) (cha1 + Math.random() * (cha2 - cha1 + 1));
	}
	

}
