/**
 *  @author ywx
 *  @ date 2018年8月28日
 */
package 日期Date类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ywx
 * @ date 2018年8月28日
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		//创建SimpleDateFormat对象，设置日期时间转换模式
		SimpleDateFormat sdf = new SimpleDateFormat();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		sdf.applyPattern(pattern);
		
		//格式化（format）：Date类型转换为String类型：String format（Date date）
		String str = sdf.format(d);
		System.out.println(str);
		
		//解析（parse）：String类型转换为Date类型：Date parse（String source）
		Date dd = sdf.parse(str);
		System.out.println(dd);
	}

}
