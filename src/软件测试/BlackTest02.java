/**
 *  @author ywx
 *  @ date 2019年3月24日
 */
package 软件测试;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BlackTest02 {
	public static void main(String[] args) {
		//创建线程
		 final Thread thread = new Thread() {
		 public void run() {
		   //设置日期格式
	       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	       
	       while (true) {
	    	   System.out.println("登录出错时间为：" + dateFormat.format(new Date()));
	    	   try {
	    		   //睡眠2*60*60*1000毫秒 = 两小时
                   Thread.sleep(2*60*60*1000);
	    		   } catch (Exception e) {
	    		  e.printStackTrace();
	    		}
	       }
		 }
		 };
		 //啟動線程
		 thread.start();
	}
}
