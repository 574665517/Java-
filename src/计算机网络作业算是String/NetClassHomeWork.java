package 计算机网络作业算是String;

import java.util.regex.*;

public class NetClassHomeWork {
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
	public static void main(String[] args) {
		NetClassHomeWork test = new NetClassHomeWork();
		test.test();
	}
	}

