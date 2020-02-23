package 实训第五周课堂作业;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ywx
 * @ date 2019年6月10日
 */
public class ListDemo01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("c");
		
		//并集
		list.addAll(list1);
		System.out.println(list);
		//交集
		list.retainAll(list1);
		System.out.println(list);
		//差集
		list.removeAll(list1);
		System.out.println(list);
		//去重复集合
		list1.removeAll(list);
		list.addAll(list1);
		System.out.println(list);
	}

}
