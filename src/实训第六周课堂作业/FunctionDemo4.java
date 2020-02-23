package 实训第六周课堂作业;

import java.util.function.Predicate;

public class FunctionDemo4 {
	public static void main(String[] args) {
		//接受一个参数返回一个布尔值
		Predicate<String> pre = "Hello"::equalsIgnoreCase;
		System.out.println(pre.test("HELLO"));
		pre = "Hello" :: contains;//接受一个字符串返回一个布尔值
		System.out.println(pre.test("He"));
		//函数式接口编程范式提供看统一的方法调用模式
		//在按照函数式接口的要求替换实现 执行时的代码不需要改变
	}
}