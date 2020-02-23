package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月22日
 */
public class Point01 {
	
	private int x, y, z;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//计算该点到原点距离平方的
	public int getRound() {
		return x * x + y * y + z * z;
	}

	public static void main(String[] args) {
		Point01 p = new Point01();
		p.setX(1);
		p.setY(2);
		p.setZ(3);
		int sum = p.getRound();
		System.out.println(sum);
	}

}
