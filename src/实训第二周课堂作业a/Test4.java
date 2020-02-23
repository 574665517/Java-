package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test4 {
	
	//少些让编译器产生二意的重载
	
	public void methodA(String str, Integer... is) {//可变参数
		System.out.println("重载1...");
	}
	
	public void methodA(String str, String... strs) {//可变参数
		System.out.println("重载2...");
	}

	public static void main(String[] args) {
//	    Test3 test3 = new Test3();
//		test3.methodA("China" ,0);
//		test3.methodA("China", "People");
//		test3.methodA("China");
//		test3.methodA("China", null);
		Test4 test4 = new Test4();
		test4.methodA("China" ,0);
		test4.methodA("China", "People");
//		test4.methodA("China");
//		test4.methodA("China", null);//属于Object，引用类型
	}

}
