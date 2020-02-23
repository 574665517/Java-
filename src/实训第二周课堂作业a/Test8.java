package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test8 {
	/**
	 * 以下代码输出的是1
	 * 一般情况下,如果有些代码必须在项目启动的时候就执行的时候,
	 * 需要使用静态代码块,这种代码是主动执行的;需要在项目启动的时候就初始化,
	 * 在不创建对象的情况下,其他程序来调用的时候,需要使用静态方法,这种代码是被动执行的. 
	 * 静态方法在类加载的时候 就已经加载 可以用类名直接调用
	 * 比如main方法就必须是静态的 这是程序入口.
	 * 两者的区别就是:静态代码块是自动执行的;静态方法是被调用的时候才执行的.
	 */
	
	static {//当类被载入时，静态代码块被执行，且只被执行一次，静态块常用来执行类属性的初始化。
		i = 100;
		System.out.println("static");
	}
	
	public static int i = 1;
	public Test8() {
		System.out.println("Test8");
	}

	public static void main(String[] args) {
		new Test8();
		System.out.println(i);
	}

}
