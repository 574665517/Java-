package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��22��
 */
public class Point {
	private int x, y, z;
	
	public Point() {
		this(0, 0, 0);//��ʼ��
	}

	public Point(int i, int j, int k) {
		// TODO �Զ����ɵĹ��캯�����
		setXYZ(i, j, k);
	}

	private void setXYZ(int x, int y, int z) {
		// TODO �Զ����ɵķ������
		setX(x);
		setY(y);
		setZ(z);
	}

	private void setZ(int z) {
		// TODO �Զ����ɵķ������
		this.z = z;
	}

	private void setY(int y) {
		// TODO �Զ����ɵķ������
		this.y = y;
	}

	private void setX(int x) {
		// TODO �Զ����ɵķ������
		this.x = x;
	}
	//����õ㵽ԭ�����ƽ����
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
