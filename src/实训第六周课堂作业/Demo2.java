package 实训第六周课堂作业;

/**
 * Lamda表达式
 * Lamda表达式语法的三种形式
• (参数) -> 单行语句;
• (参数) -> {多行行语句};
• (参数) -> 表达式;
• 如果无参数就可以写成
• () -> 单行语句;
 * @author ywx
 * @ date 2019年6月17日
 */

interface Inter1 {
	void print(String string);
}
interface Inter2 {
	int add(int a, int b);
}
public class Demo2 {//函数式编程
	public static void main(String[] args) {
		fun(()->System.out.println("Hello World!"));//对象指向接口的实现
//		fun1("test");
//		fun1(()->System.err.println("test"));
		fun1((s)-> {
			s = s + s;
			System.out.println(s);
		});
		
		fun2((x, y) -> x + y);
	}
	//无参的单条语句
	private static void fun(IPrintInter p) {
		p.print();
	}
	//带参数的多条语句
	private static void fun1(Inter1 inm) {
//		System.out.println(val);
		inm.print("test");
	}
	private static void fun2(Inter2 in2) {
		int result = in2.add(11, 22);
		System.out.println(result);
	}
}
