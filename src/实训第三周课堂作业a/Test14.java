package 实训第三周课堂作业a;

public class Test14 {//下列代码的输出你认为该是什么？int 版本被调用
	public static void main(String[] args) {
		someMethod(1);
	}
	public static void someMethod(int i){//基本数据类型
		System.out.println("int 版本被调用");
	}
	public static void someMethod(Integer i){//引用类型
		System.out.println("Integer 版本被调用");
	}
}
