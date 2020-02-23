package 多态;
/**
 * 
 * @author ywx
 * @ date 2019年12月29日
 */
public abstract class Shapes { 
	public  Shapes() {
		System.out.println("Shapes类构造方法被调用");
	}
	/**
	*得出周长
	*/
	public abstract double getperimeter();
	
	/**
	*得到面积
	*/
	public abstract double getArea();//抽象方法，不实现
	
	public void draw(Shapes s){}//空实现方法
}
