package 实训第五周课堂作业d;

/**
 * 下列代码输出的内容是：AB,B
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test10 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer ("A");
		StringBuffer b = new StringBuffer ("B");
		operate(a,b);
		System.out.println(a + "," + b);
	}
	private static void operate(StringBuffer x, StringBuffer y) {//值传递，出去之后是谁还是谁
		x.append(y);//x = xy
		y = x;//x的地址赋给y
	}
}
