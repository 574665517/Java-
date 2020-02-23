package 实训第五周课堂作业d;

import java.util.*;

/**
 * 试试动手优化以下代码：
 * 测试调用该方法1000万次，大约耗时30秒,怎么优化提升性能？
 * @author ywx
 * @ date 2019年6月14日
 */
public class BabyBoomer {
	private Date birthDate = new Date();
	// 判断是否是某个阶段人
	public boolean isBabyBoomer() {
		/**
		 * 没有必要在方法中创建对象
		 */
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		// 开始时间
		cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = cal.getTime();//创建Date对象
		// 结束时间
		cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = cal.getTime();//创建Date对象
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
	public static void main(String[] args) {
		BabyBoomer baby = new BabyBoomer();
		baby.isBabyBoomer();
	}
}
