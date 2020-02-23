package 实训第三周课堂作业a;

class X {//猜猜输出什么？White
	/**
	 * 静态内部类使用方法和内部属性使用方法不同
	 */
//	static C Y = new C();
	static class Y {//静态内部类Y
		static String Z = "Black";
    }
//	static C Y = new C();//静态属性Y，可以类名.属性名
}
class C {
	String Z = "White";
}

public class ObscureTest {
	public static void main(String[] args) {
		System.out.println(X.Y.Z);
//		System.out.println(new X().Y().Z);
	}
}


