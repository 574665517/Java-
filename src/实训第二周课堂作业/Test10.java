package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��25��
 */
public class Test10 {
	
	private String xm;// ����
	private String xb;// �Ա�
	private int nl;// ����
	private String jtzz;// ��ͥסַ
	private String xl;// ѧ��

	
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public int getNl() {
		return nl;
	}

	public void setNl(int nl) {
		this.nl = nl;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	public Test10(String xm, String xb, int nl, String jtzz, String xl) {
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
		this.jtzz = jtzz;
		this.xl = xl;
	}
	public static void main(String[] args) {
		Test10 t = new Test10("����", "��", 21, "�������񹲺͹�", "����");
		System.out.println(t.xm + "\t�Ա�\t" + t.xb + "\t����\t" + t.nl + "\t��ͥסַ\t" + t.jtzz + "\tѧ��\t" + t.xl);
	}

}
