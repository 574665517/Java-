package string类型;

import java.lang.StringBuffer;;

public class StringBufferDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String str = new String();
		// 拼接10000个字符

		int maxCount = 10000;
		long begin = System.currentTimeMillis();
		for (int i = 0; i < maxCount; i++) {
			sb.append('a');
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer运算需要的时间:" + (end - begin));

		begin = System.currentTimeMillis();
		for (int i = 0; i < maxCount; i++) {
			str += 'a';
		}
		end = System.currentTimeMillis();
		System.out.println("String运算需要的时间:" + (end - begin));
	}

}
