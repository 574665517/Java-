package 集合类;
import java.util.*;

public class MapExample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1","Mon");
		map.put("2","Tuesday");
		map.put("3","Wendsday");
		map.put("4","Thursday");
		map.put("5","Thursday");
		map.put("3","abcd");
		String day=(String)map.get("2"); //Tuesday
		System.out.println(day);//Tuesday
		//{3=abcd, 5=Thursday, 2=Tuesday, 4=Thursday, 1=Mon}  
		System.out.println(map);
		System.out.println("************"); 
		map.remove("1");//删除key=1的元素

		//获取所有的key,遍历Map集合
		Set set1 = map.keySet();
		Iterator itr1 = set1.iterator();
		while(itr1.hasNext()){
			String key = (String)itr1.next();
			String value = (String)map.get(key);
			System.out.println(key+"-->"+value);
		}
		System.out.println("------------");  
		//获取所有的entry,遍历Map集合
		Set set2 = map.entrySet();
		Iterator itr2 = set2.iterator();
		while(itr2.hasNext()) {
			Map.Entry entry = (Map.Entry)itr2.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
    
	}
}
