package string����;

import java.util.regex.*;

public class Test {
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

	private void division() {
		String str = "12345654321";
		String[] firstArray = str.split("5", 2);
		String[] secondArray = str.split("1", 3);
		System.out.println("str��ԭֵ��:" + str);
		System.out.println("�ָ�Ľ��:");
		for (String a : firstArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();// ����
		System.out.println("�ָ�Ľ��:");
		for (String a : secondArray) {
			System.out.print("[" + a + "]");
		}
	}

	private void sub() {
		String string = "11100011111000";
		// �����ַ��������ַ�
		for (int i = 0; i < string.length(); i++) {
			String s = string.substring(i, i + 1);
			// ���ͨ��s������ַ����г���������3�Σ�������ַ�
			if (Pattern.matches(".*" + s + ".*" + s + ".*" + s + ".*", string)) {
				System.out.println("�ָ�Ľ���ǣ�" + s);
			}
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.division();
		System.out.println("\n");
		test.sub();
		System.out.println("\n");
		test.test();
	}

}
