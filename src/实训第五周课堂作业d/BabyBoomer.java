package ʵѵ�����ܿ�����ҵd;

import java.util.*;

/**
 * ���Զ����Ż����´��룺
 * ���Ե��ø÷���1000��Σ���Լ��ʱ30��,��ô�Ż��������ܣ�
 * @author ywx
 * @ date 2019��6��14��
 */
public class BabyBoomer {
	private Date birthDate = new Date();
	// �ж��Ƿ���ĳ���׶���
	public boolean isBabyBoomer() {
		/**
		 * û�б�Ҫ�ڷ����д�������
		 */
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		// ��ʼʱ��
		cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = cal.getTime();//����Date����
		// ����ʱ��
		cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = cal.getTime();//����Date����
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
	public static void main(String[] args) {
		BabyBoomer baby = new BabyBoomer();
		baby.isBabyBoomer();
	}
}
