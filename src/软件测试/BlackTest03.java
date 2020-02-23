/**
 *  @author ywx
 *  @ date 2019年3月26日
 */
package 软件测试;

import java.util.*;
import java.util.regex.*;

public class BlackTest03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入密码，如果成功则显示成功，否则显示失败!:");
		String Pwd = input.nextLine(); //输入的密码
		isValidPassword(Pwd);
		
		new BlackTest03();
	}

	public static void isValidPassword(String Pwd) {
		if(isOnlyCharAndNum(Pwd) || isContainChar(Pwd)) {
	        System.out.println("Valid Password!");  //密码有效
	    } else {
	        System.out.println("InValid Password!");  //密码无效
	    }
	}

	public static boolean isContainChar(String Pwd) {
		String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(Pwd);
        System.out.println(m.find());
        return false;
	}

	public static boolean isOnlyCharAndNum(String Pwd) {
		for(int i = 0; i < Pwd.length(); i++){
	        if(!Character.isLetter(Pwd.charAt(i)) &&   //字符串中的i对应字符判断是否是字母
	                !Character.isDigit(Pwd.charAt(i))) {  //字符串中的i对应字符判断是否是数字
	            return false;
	        } else {
	            return true;
	        }
	    }
	    return false;
	}

}
