package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * 当传入一个原生数据类型数组时，
 * Arrays.asList() 的真正得到的参数就不是数组中的元素，
 * 而是数组对象本身！此时List 的唯一元素就是这个数组，
 * 
 * @author ywx
 * @ date 2019年7月8日
 */
public class Test01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
//		int[] myArray = { 1, 2, 3 };
		Integer[] myArray = { 1, 2, 3 };//使用包装类型数组就可以解决这个问题。
		List myList = Arrays.asList(myArray);//Arrays.asList()是泛型方法，传入的对象必须是对象数组
		System.out.println(myList.size());//1
		System.out.println(myList.get(0));//数组地址值
		System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
		int [] array = (int[] ) myList.get(0);
		System.out.println(array[0]);//1

	}

}
