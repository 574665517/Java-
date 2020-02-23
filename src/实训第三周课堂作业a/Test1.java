package 实训第三周课堂作业a;
/**
* null本身不是对象，
* 也不是Objcet的实例null本身虽然能代表一个不确定的对象
* * 但就null本身来说，它不是对象，也不知道什么类型，也不是java.lang.Object的实例。
* @param args
*/
public class Test1 {//下面代码执行结果是？Double array
	public static void main(String[] args) {
		new Test1(null);//Test1内函数类型是null,null不是对象，也不是Object实例
	}
	private Test1(Object o) {//构造函数重载
		System.out.println("Object");
	}
	private Test1(double[] doubleArray) {
		System.out.println("Double array");
	}
}
