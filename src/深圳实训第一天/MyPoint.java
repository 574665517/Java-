package 深圳实训第一天;

/**
 * @author ywx
 * @ date 2019年12月27日
 */
public class MyPoint {
//	private int start;
//	private int end;

	public static void main(String[] args) {
//		Point start = new Point();
//		start.setX(10);
//		start.setY(10);
//		Point end = new Point();
//		end.setX(20);
//		end.setY(20);
//		System.out.println(start.getX());
//		System.out.println(start.getY());
//		System.out.println(end.getX());
//		System.out.println(end.getY());
		Point end = new Point();
		end.setX(10);
		end.setY(10);
		Point stray = new Point();
		stray = end;
		System.out.println("第一次编译");
		System.out.println(end.getX());
		System.out.println(end.getY());
		System.out.println(stray.getX());
		System.out.println(stray.getY());
		
		stray.setX(50);//赋予stary变量的成员x，y新值
		stray.setY(50);
		System.out.println("第二次编译");
		System.out.println(end.getX());
		System.out.println(end.getY());
		System.out.println(stray.getX());
		System.out.println(stray.getY());
		
		Point start = new Point();//赋予start变量的成员x，y新值
		start.setX(40);
		start.setY(40);
		System.out.println("第三次编译");
		System.out.println(start.getX());
		System.out.println(start.getY());
		System.out.println(end.getX());
		System.out.println(end.getY());
	}

}
