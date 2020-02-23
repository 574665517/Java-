package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * ������һ��ԭ��������������ʱ��
 * Arrays.asList() �������õ��Ĳ����Ͳ��������е�Ԫ�أ�
 * ���������������ʱList ��ΨһԪ�ؾ���������飬
 * 
 * @author ywx
 * @ date 2019��7��8��
 */
public class Test01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
//		int[] myArray = { 1, 2, 3 };
		Integer[] myArray = { 1, 2, 3 };//ʹ�ð�װ��������Ϳ��Խ��������⡣
		List myList = Arrays.asList(myArray);//Arrays.asList()�Ƿ��ͷ���������Ķ�������Ƕ�������
		System.out.println(myList.size());//1
		System.out.println(myList.get(0));//�����ֵַ
		System.out.println(myList.get(1));//����ArrayIndexOutOfBoundsException
		int [] array = (int[] ) myList.get(0);
		System.out.println(array[0]);//1

	}

}
