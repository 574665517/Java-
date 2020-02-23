 package 集合类;

import java.util.*;

public class Muster {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();
		list.add("a");// 向集合中添加数据
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();// 创造迭代器
		while (it.hasNext()) {// 判断是否有下一个元素
			String str = (String) it.next();// 获取集合中的元素
			System.out.println(str);
		}

	}

}
