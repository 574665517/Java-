package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��22��
 */
public class TriAngle {
	
	private int base, height;//�����εױ߳��͸�
	
	public TriAngle(int base, int height) {
		// TODO �Զ����ɵĹ��캯�����
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
