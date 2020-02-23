/**
 *  @author ywx
 *  @ date 2019年3月6日
 */
package 软件测试;

public class WhiteTest01 {
	
	public void Dowork (int x, int y, int z) {
		double k = 0,j = 0;
		if ((x > 3) && (z < 10)) {
			k = x * y - 1;
			j = Math.sqrt(k);
		}
		if ((x == 4) || (y > 5)) {
			j = x * y + 10;
		}
		j = j % 3;
		System.out.println(j);
	}

	public static void main(String[] args) {
		WhiteTest01 t = new WhiteTest01();
		t.Dowork(2, 4, 5);
	}

}
