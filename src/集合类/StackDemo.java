package 集合类;

import java.util.Stack;

/**
 * @author ywx
 * @ date 2019年6月10日
 */
public class StackDemo {
	public static void main(String args[]) {
		Stack<String> s = new Stack<String>();//实例化Stack对象
		s.push("A"); // 入栈
		s.push("B"); // 入栈
		s.push("C"); // 入栈
		System.out.print(s.pop() + "、") ; // 出栈
		System.out.print(s.pop() + "、") ; // 出栈
		System.out.println(s.pop() + "、") ; // 出栈
		System.out.print(s.pop()+ "、");//错误,异常,栈为空
	}
}
