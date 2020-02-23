package 集合类;
import java.util.*;

/**
 * key不能相同，value可以相同，entry值
 * @author ywx
 * @ date 2019年12月30日
 */
public class MapExample1 {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {
	  Map map = new HashMap();//实现接口类的HashMao对象
	  map.put("1","Mon");
	  map.put("2","Tuesday");
	  map.put("3","Wendsday");
	  map.put("4","Thursday");
	  map.put("4","abcd");
	  map.put("5","Thursday");
	  String day = (String)map.get("2");//Object类型，造型为String类型 
	  System.out.println(day);
	  System.out.println(map);
  }
}