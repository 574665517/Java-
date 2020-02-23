/**
 *  @author ywx
 *  @ date 2018年8月1日
 */
package 实训第一周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月16日
 */
public class WaterLily {

	/**
	 * 打印水仙花数，153 = 1^3 + 5^3 + 3^3
	 * @param args
	 */
	public static void main(String[] args) {
		int a1,a2,a3;//个位，十位，百位
		for(int i = 101;i < 1000;i++) {
			a3 = i / 100;
			a2 = i % 100 / 10;
			a1 = i % 10;
			if(a3 * a3 * a3 + a2 * a2 * a2 + a1 * a1 * a1 == i) {
				System.out.println(i + "是个水仙花数");
			}
		}
	}

}
