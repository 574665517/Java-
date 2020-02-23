package 实训第二周课堂作业a;

import java.util.Arrays;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test6 {
	
	//字符串排序,谁在前谁在后？

	public static void main(String[] args) {
		String[] strs = { "张三(Z)", "李四(L)", "王五(W)" };
		// 排序,默认是升序
		Arrays.sort(strs);
		int i = 0;
		for (String str : strs) {
			System.out.println((++i) + " " + str);
		}
	}
}

