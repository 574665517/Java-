package ��̬;
/**
 * 
 * @author ywx
 * @ date 2019��12��29��
 */
public class ShapeCircle extends Shapes {
	private double r;
	public ShapeCircle() {
		setRadius(0.0);
	}
	public ShapeCircle(double ra) {
		System.out.println("ShapeCircle�๹�췽��������");
		this.setRadius(ra);
	}
	public void setRadius(double rad) {
		this.r = rad;
	}
	/**
	*���Ǹ���ĳ��󷽷�
	*/	
	public double getperimeter() {
		return 2.0 * Math.PI * this.r;
	}
	public double getArea() {
		return  this.r * this.r * Math.PI;
	}
	public static void main(String args[]) {
		Shapes sc = new ShapeCircle(5);
		System.out.println("�ܳ���" + sc.getperimeter());
		System.out.println("�����" + sc.getArea());
	}
}
