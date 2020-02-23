package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月25日
 */
public class Test10 {
	
	private String xm;// 姓名
	private String xb;// 性别
	private int nl;// 年龄
	private String jtzz;// 家庭住址
	private String xl;// 学历

	
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
		Test10 t = new Test10("熊熊", "男", 21, "熊熊人民共和国", "初中");
		System.out.println(t.xm + "\t性别\t" + t.xb + "\t年龄\t" + t.nl + "\t家庭住址\t" + t.jtzz + "\t学历\t" + t.xl);
	}

}
