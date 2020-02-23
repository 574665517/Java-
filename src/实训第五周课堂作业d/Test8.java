package 实训第五周课堂作业d;

/**
 * 执行下列代码创建了几个对象,最终x等于多少？X:104
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test8 {
	private static int x = 100;//静态变量可以用对象来调用也可以用类来调用
	//不管什么对x的什么操作，都会改变x
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Test8 hs1 = new Test8();
		hs1.x++;
		Test8 hs2 = new Test8();
		hs2.x++;
		hs1 = new Test8();
		hs1.x++;
		Test8.x++;
		System.out.println("X:" + x);
	}
}
