package 集合类;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		List <String> allList = null ; // 声明List对象
		allList = new ArrayList<String>();
		System.out.println("集合操作前是否为空？" + allList.isEmpty());
		allList.add("Hello"); // 增加元素
		allList.add(0, "World");
		allList.add("zhangwuji");
		allList.add("www.chuanxi.com");
		System.out.println(allList.contains("Hello") ? "\"Hello\"字符串存在！" : "\"Hello\"字符串不存在！");
		List<String> allSub = allList.subList(2, 3);//取出部分集合
		System.out.print("集合截取：");
		for (int i = 0; i < allSub.size(); i++){// 截取部分集合
			System.out.print(allList.get(i) + "、");
		}
		System.out.println("") ;
		System.out.println("World字符串的位置：" + allList.indexOf("World"));
		System.out.println("集合操作后是否为空？" + allList.isEmpty());
	}
}
