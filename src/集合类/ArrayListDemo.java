package ������;

import java.util.*;

/**
 * ArrayList���ȿɱ䣬���ظ�
 * @author ywx
 * @ date 2019��12��30��
 */
public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();//����ӿڱ�̣�ArrayListʵ�ֵĽӿڱ��
		System.out.println(list.size());
		list.add(5);//�Զ�װ��
		list.add(new Integer(4));
		list.add(new Integer(4));
		list.add("second");
		list.add("second");
		list.add("����");
		list.add("����");
		list.add("����");
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
