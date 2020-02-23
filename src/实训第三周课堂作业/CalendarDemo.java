package 实训第三周课堂作业;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class CalendarDemo implements MyDateTime{

	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo();
		c.getDate();
		c.getDateTime();
	}

	@Override
	public void getDate() {
		Calendar calendar = Calendar.getInstance();
	    // 或者用 Date 来初始化 Calendar 对象
	    calendar.setTime(new Date());
	    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar.getTime());
	    System.out.println(str);
	}

	@Override
	public void getDateTime() {
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
