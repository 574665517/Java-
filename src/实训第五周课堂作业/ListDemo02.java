package ʵѵ�����ܿ�����ҵ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ywx
 * @ date 2019��6��10��
 */
public class ListDemo02 {

	public static void main(String[] args) {
		String[] str = {"a","b","c","d","e"};
        String[] str1 = {"d","e","f","g","h"};
        List<String> list = new ArrayList<String>(Arrays.asList(str));
        List<String> list1 = new ArrayList<String>(Arrays.asList(str1));
        //ȥ�ظ�����
      	list1.removeAll(list);
      	list.addAll(list1);
      	System.out.println(list);
	}

}
