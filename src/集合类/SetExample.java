package ������;

import java.util.*;
/**
 * ���ϱȽ�equls������new Integer(4)����ͬ���ġ�������ַ��һ��
 * @author ywx
 * @ date 2019��12��30��
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
	  Iterator itr = set.iterator();//��̬����������ֱ��new���󣬵�������
	  while(itr.hasNext()) {//�Ƿ�����һ��Ԫ��
		  System.out.println(itr.next());
      }
  }	
}
