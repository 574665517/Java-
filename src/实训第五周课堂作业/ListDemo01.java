package ʵѵ�����ܿ�����ҵ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ywx
 * @ date 2019��6��10��
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
		
		//����
		list.addAll(list1);
		System.out.println(list);
		//����
		list.retainAll(list1);
		System.out.println(list);
		//�
		list.removeAll(list1);
		System.out.println(list);
		//ȥ�ظ�����
		list1.removeAll(list);
		list.addAll(list1);
		System.out.println(list);
	}

}
