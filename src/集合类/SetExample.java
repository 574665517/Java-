package 集合类;

import java.util.*;
/**
 * 集合比较equls，两个new Integer(4)，是同样的。本来地址不一样
 * @author ywx
 * @ date 2019年12月30日
 */

public class SetExample {
  @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	  Set set = new HashSet();
	  System.out.println(set.size());//0
	  set.add(8.8);
	  set.add("one");
	  set.add("second");
	  set.add("3rd");
	  set.add(new Integer(4));
	  set.add(new Float(5.0F));
	  set.add("second");
	  set.add(new Integer(4));	 
	  //[one, 4, 8.8, 5.0, 3rd, second]
	  System.out.println(set);
	  System.out.println("*************");
	  Iterator itr = set.iterator();//静态方法，不能直接new对象，迭代器，
	  while(itr.hasNext()) {//是否有下一个元素
		  System.out.println(itr.next());
      }
  }	
}
