package 注解;

import java.util.Date;

/**
 * @Deprecated注释的主要功能,是用来声明一个不建议
使用的方法。如果在程序中使用了此方法的话,则在
编译时将出现警告信息。
 * @author ywx
 * @ date 2019年6月13日
 */
class Demo { // 定义Demo类
	@Deprecated // 声明不建议使用的操作
	public String getInfo() { // 此方法不建议用户使用
		return "这是一个Demo类。"; // 返回信息
	}
}

public class DeprecatedAnnotationDemo01 {
	@SuppressWarnings("deprecation")//压制警告使用了不赞成使用的类或方法时的警告
	public static void main(String[] args) {
		Demo d = new Demo() ; // 实例化Demo对象
		System.out.println(d.getInfo());//编译时,将出现警告信息
		Date date = new Date();
		date.getDate();//replaced by Calendar.get(Calendar.DAY_OF_MONTH)
	}
}
