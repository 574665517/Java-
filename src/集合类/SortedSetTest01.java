package 集合类;

/*
 *被存储元素实现了comparable接口
  TreeSet集合中在添加元素的时候，会调用
  comparaTo（）方法完成比较！
*/
import java.util.*;
public class SortedSetTest01 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SortedSet ss=new TreeSet();//TreeSet实现了SortedSet接口
		ss.add("drf");
		ss.add("abc");
		ss.add("b");
		ss.add("ccc");
		System.out.println(ss);
		Iterator it = ss.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
