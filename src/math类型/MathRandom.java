package math����;

public class MathRandom {
	/**
	 * �������ż���ķ���
	 * 
	 * @param num1
	 *            ��ʼ��Χ����
	 * @param num2
	 *            ��ֹ��Χ����
	 * @return ����ķ�Χ��ż��
	 */
	public int GetEvenNum(int num1, int num2) {
		// ����num1��num2֮��������
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
