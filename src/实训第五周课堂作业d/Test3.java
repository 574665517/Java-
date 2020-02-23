package 实训第五周课堂作业d;

import java.util.List;

/**
 * 泛型什么时候用什么通配符？
 * 通配符只有在修饰一个变量时会用到，使用它可方便地引用包含了多种类型的泛型
 * @author ywx
 * @ date 2019年6月14日
 */

public class Test3 {
	public static void main(String[] args) {
//		List<Integer> list = null;
//		read(list);
	}
	@SuppressWarnings("unused")
	                            //List<? super E> list
	public static <E> void read(List<? extends E> list) {//上标通配符，最高不超过E，只用来读
		                        //?代表E的类型或其子类类型 extends聚成与E
		int sum = 0;
		for (E obj : list) {
			// 业务逻辑操作
		}
	}
	                         //List<? extends Number> list
	public static void write(List<? super Number> list) {//下标通配符，最低不低于Number，只用来写
		                     //？代表的类型是Number类型或Number的父类型 
		// 加入一个元素
		list.add(123L);//Integer是Number的子类型
	}
}
