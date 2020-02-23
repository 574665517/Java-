package 多态;
/**
 * 
 * @author ywx
 * @ date 2019年12月29日
 */
public class ShapeCircle extends Shapes {
	private double r;
	public ShapeCircle() {
		setRadius(0.0);
	}
	public ShapeCircle(double ra) {
		System.out.println("ShapeCircle类构造方法被调用");
		this.setRadius(ra);
	}
	public void setRadius(double rad) {
		this.r = rad;
	}
	/**
	*覆盖父类的抽象方法
	*/	
	public double getperimeter() {
		return 2.0 * Math.PI * this.r;
	}
	public double getArea() {
		return  this.r * this.r * Math.PI;
	}
	public static void main(String args[]) {
		Shapes sc = new ShapeCircle(5);
		System.out.println("周长：" + sc.getperimeter());
		System.out.println("面积：" + sc.getArea());
	}
}
