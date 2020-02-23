package 日期Date类;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);//欧美人的时间风格
		
		//System.out.println(date.toLocaleString());//本地区域时间风格
		
		//获得日期/时间格式器，该格式器具有默认语言环境的默认格式化风格
		DateFormat df = DateFormat.getTimeInstance();
		String formateDate = df.format(date);//格式化日期
		System.out.println(formateDate);//输出格式化的日期
		System.out.println(date.getTime());//获取当前时间距离1970年1月1日00:00:00以来的毫秒数
	}

}
