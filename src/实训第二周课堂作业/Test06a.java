package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Test06a {
	
	static int num = 1;
//	public static int x = 5;
//	private static int y = 6;
	
	public static void print() {
		System.out.println("static函数调用");
	}
	static {
		System.out.println("静态代码块");
	}

	public static void main(String[] args) {
		System.out.println(Test06a.num);//直接用类名来访问静态成员变量
		Test06a.print();
		
	}

}
