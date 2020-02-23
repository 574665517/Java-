package 实训第三周课堂作业;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ywx
 * @ date 2019年6月1日
 */
public class SimpleDateFormatDemo implements MyDateTime {

	@Override
	public void getDate() {
		String str = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
	    System.out.println(str);
	}

	@Override
	public void getDateTime() {
		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());
	    System.out.println(str);
	}

	public static void main(String[] args) {
		SimpleDateFormatDemo s = new SimpleDateFormatDemo();
		s.getDate();
		s.getDateTime();
	}

}
