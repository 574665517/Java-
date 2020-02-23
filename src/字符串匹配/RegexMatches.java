package 字符串匹配;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ywx
 * @ date 2019年3月31日
 * 
 * 可以通过调用 matcher 对象的 groupCount 方法来查看表达式有多少个分组。
 * groupCount 方法返回一个 int 值，表示matcher对象当前有多个捕获组。
 */
public class RegexMatches {
	//捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
	
	public static void main( String args[] ) {
		 
	      // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	 
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);
	 
	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
	   }
}
