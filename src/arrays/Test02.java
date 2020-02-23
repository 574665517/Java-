package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * ʹ�ü��ϵ��޸ķ���:add()��remove()��clear()���׳��쳣��
 * Arrays.asList() �������صĲ����� java.util.ArrayList 
 * ���� java.util.Arrays ��һ���ڲ���,����ڲ��ಢû��ʵ�ּ��ϵ��޸ķ�������˵��û����д��Щ������
 * 
 * @author ywx
 * @ date 2019��7��8��
 */
public class Test02 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List myList = Arrays.asList(1, 2, 3);
//		myList.add(4);//����ʱ����UnsupportedOperationException
//		myList.remove(1);//����ʱ����UnsupportedOperationException
//		myList.clear();//����ʱ����UnsupportedOperationException
		System.out.println(myList.getClass());//class java.util.Arrays$ArrayList
	}

}
