package 实训第三周课堂作业a;

import static java.util.Arrays.toString;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class Test13 extends Object{//期望打印输出给定的数组,能打印吗？
	public static void main(String[] args){
		Object[] ss = {1, 2, 3, 4, 5};
		printArgs(ss);
//		printArgs(1, 2, 3, 4, 5);
	}
	static void printArgs(Object[]... args){
//		System.out.println(toString(args));//Object里面的toString没有参数，不能带参数
	}
//	private static char[] toString(Object[] args) {
//		// TODO 自动生成的方法存根
//		return null;
//	}
}
