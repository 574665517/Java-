package ������;
import java.util.*;

/**
 * key������ͬ��value������ͬ��entryֵ
 * @author ywx
 * @ date 2019��12��30��
 */
public class MapExample1 {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {
	  Map map = new HashMap();//ʵ�ֽӿ����HashMao����
	  map.put("1","Mon");
	  map.put("2","Tuesday");
	  map.put("3","Wendsday");
	  map.put("4","Thursday");
	  map.put("4","abcd");
	  map.put("5","Thursday");
	  String day = (String)map.get("2");//Object���ͣ�����ΪString���� 
	  System.out.println(day);
	  System.out.println(map);
  }
}