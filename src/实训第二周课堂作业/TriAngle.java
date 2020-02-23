package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月22日
 */
public class TriAngle {
	
	private int base, height;//三角形底边长和高
	
	public TriAngle(int base, int height) {
		// TODO 自动生成的构造函数存根
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea() {
		return base * height / 2;
	}

}
