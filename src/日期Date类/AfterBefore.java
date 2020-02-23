package 日期Date类;

import java.util.Date;

/**
 * @author ywx
 * @ date 2018年9月28日
 */
public class AfterBefore {

	public static void main(String[] args) {
		Date beforeDate = new Date(302672606563L);//创建以前的日期对象
		System.out.println("以前的日期：" + beforeDate);//输出以前的日期
		Date nowDate = new Date();//创建现在的日期
		System.out.println("现在的日期：" + nowDate);//输出现在的日期
		//使用after方法判断日期nowDate是否在日期beforeDate之后，如果是则flag为true
		boolean flag = nowDate.after(beforeDate);
		System.out.println("现在的日期在以前的日期之后吗！" + flag);
		//使用before方法判断日期nowDate是否在日期beforeDatez之前，如果是则flag1为true
		boolean flag1 = nowDate.before(beforeDate);
		System.out.println("现在的日期在以前的日期之后吗！" + flag1);
	}

}
