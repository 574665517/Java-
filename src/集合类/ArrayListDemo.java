package 集合类;

import java.util.*;

/**
 * ArrayList长度可变，可重复
 * @author ywx
 * @ date 2019年12月30日
 */
public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();//面向接口编程，ArrayList实现的接口编程
		System.out.println(list.size());
		list.add(5);//自动装箱
		list.add(new Integer(4));
		list.add(new Integer(4));
		list.add("second");
		list.add("second");
		list.add("张三");
		list.add("李四");
		list.add("王五");
//		for(String s:list) 
//		System.out.println(s);
			System.out.println(list);
/*		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
*/
	}

}
