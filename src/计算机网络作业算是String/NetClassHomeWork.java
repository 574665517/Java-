package �����������ҵ����String;

import java.util.regex.*;

public class NetClassHomeWork {
	// �������Ҫ��
	public void test() {
		StringBuffer s1 = new StringBuffer("1000100111000111110011001"); // ԭ�ַ���
		String s2 = "0"; // Ҫ������ַ���
		Pattern p = Pattern.compile("11111"); // ����λ��
		Matcher m = p.matcher(s1.toString());
		if (m.find()) {
			s1.insert((m.start() + 5), s2); // �����ַ���
		}
		System.out.println(s1.toString());
	}
	public static void main(String[] args) {
		NetClassHomeWork test = new NetClassHomeWork();
		test.test();
	}
	}

