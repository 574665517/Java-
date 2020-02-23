package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月22日
 */
public class TestTriAngle {

	public static void main(String[] args) {
		int base = 2, height = 3;//设置底边长和高
		TriAngle t = new TriAngle(base, height);
		int t1 = t.calculateArea();
		System.out.println(t1);
	}

}
