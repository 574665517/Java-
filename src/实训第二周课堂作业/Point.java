package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月22日
 */
public class Point {
	private int x, y, z;
	
	public Point() {
		this(0, 0, 0);//初始化
	}

	public Point(int i, int j, int k) {
		// TODO 自动生成的构造函数存根
		setXYZ(i, j, k);
	}

	private void setXYZ(int x, int y, int z) {
		// TODO 自动生成的方法存根
		setX(x);
		setY(y);
		setZ(z);
	}

	private void setZ(int z) {
		// TODO 自动生成的方法存根
		this.z = z;
	}

	private void setY(int y) {
		// TODO 自动生成的方法存根
		this.y = y;
	}

	private void setX(int x) {
		// TODO 自动生成的方法存根
		this.x = x;
	}
	//计算该点到原点距离平方的
	public int getRound() {
		return x * x + y * y + z * z;
	}

	public static void main(String[] args) {
		Point p = new Point();
		p.setXYZ(1, 1, 1);
		int dist = p.getRound();
		System.out.println(dist);
	}

}
