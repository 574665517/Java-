package 实训第五周课堂作业d;

/**
 * 分析下面代码,写出结果，说明缘由？[4,2]:null
 * @author ywx
 * @ date 2019年6月14日
 */
class Point {
	protected final int x, y;
	private final String name;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		name = makeName();//初始化makeName()返回x，y没有name
	}
	protected String makeName() { 
		return "[" + x + "," + y + "]"; 
	}
	public final String toString() { 
		return name; 
	}
}
	public class ColorPoint extends Point {//没有toString方法，调用父类的toString()方法
		protected final String color;
		ColorPoint(int x, int y, String color) {
			super(x, y);
			this.color = color;
		}
		protected String makeName() {
			return super.makeName() + ":" + color;
		}
		public static void main(String[] args) {
			System.out.println(new ColorPoint(4, 2, "Blue"));//打印对象信息，调用对象的toString()方法来输出
		}
}
