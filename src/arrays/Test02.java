package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * 使用集合的修改方法:add()、remove()、clear()会抛出异常。
 * Arrays.asList() 方法返回的并不是 java.util.ArrayList 
 * 而是 java.util.Arrays 的一个内部类,这个内部类并没有实现集合的修改方法或者说并没有重写这些方法。
 * 
 * @author ywx
 * @ date 2019年7月8日
 */
public class Test02 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List myList = Arrays.asList(1, 2, 3);
//		myList.add(4);//运行时报错：UnsupportedOperationException
//		myList.remove(1);//运行时报错：UnsupportedOperationException
//		myList.clear();//运行时报错：UnsupportedOperationException
		System.out.println(myList.getClass());//class java.util.Arrays$ArrayList
	}

}
