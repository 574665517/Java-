package string类型;

import java.util.regex.*;

public class Test {
	// 这就是我要的
	public void test() {
		StringBuffer s1 = new StringBuffer("1000100111000111110011001"); // 原字符串
		String s2 = "0"; // 要插入的字符串
		Pattern p = Pattern.compile("11111"); // 插入位置
		Matcher m = p.matcher(s1.toString());
		if (m.find()) {
			s1.insert((m.start() + 5), s2); // 插入字符串
		}
		System.out.println(s1.toString());
	}

	private void division() {
		String str = "12345654321";
		String[] firstArray = str.split("5", 2);
		String[] secondArray = str.split("1", 3);
		System.out.println("str的原值是:" + str);
		System.out.println("分割的结果:");
		for (String a : firstArray) {
			System.out.print("[" + a + "]");
		}
		System.out.println();// 换行
		System.out.println("分割的结果:");
		for (String a : secondArray) {
			System.out.print("[" + a + "]");
		}
	}

	private void sub() {
		String string = "11100011111000";
		// 遍历字符串所有字符
		for (int i = 0; i < string.length(); i++) {
			String s = string.substring(i, i + 1);
			// 如果通过s在这个字符串中出现了至少3次，输出该字符
			if (Pattern.matches(".*" + s + ".*" + s + ".*" + s + ".*", string)) {
				System.out.println("分割的结果是：" + s);
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
