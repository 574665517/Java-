/**
 *  @author ywx
 *  @ date 2018年8月28日
 */
package 日期Date类;

import java.util.Calendar;

/**
 * @author ywx
 * @ date 2018年8月28日
 */
public class CalenderDemo1 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(c.get(Calendar.YEAR));
		
	}

}
