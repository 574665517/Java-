package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的本质是类型参数化，解决不确定具体对象类型的问题，
 * 泛型可以定义在类、接口、方法中，编译器通过识别尖括号和尖括号内的字母来解析泛型
 * <String, T, Alibaba>
 * @author ywx
 * @ date 2019年12月29日
 */
public class ListNoGeneric {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add(new Object());
		a1.add(new Integer(111));
		a1.add(new String("hello a1a1"));
		System.out.println(a1.toString());
		
		//第二段：把a1引用赋值给a2，注意a2与a1的区别是增加了泛型限制<Object>
		List<Object> a2 = a1;
		a2.add(new Object());
		a2.add(new Integer(222));
		a2.add(new String("hello a2a2"));
		System.out.println(a2.toString());
		
		//第三段：把a1引用赋值给a3，注意a3与a1的区别是增加了泛型<Integer>
		List<Integer> a3 = a1;
		a3.add(new Integer(333));
		//下方两行编译出差，不允许增加非Integer类型进入集合
//		a3.add(new String("hello a3a3"));
//		a3.add(new Object());
		System.out.println(a3.toString());
		
		//第四段：把a1引用赋值给a4，注意a4与a1的区别是增加了通配符
		List<?> a4 = a1;
		//允许删除和取出元素
		a1.remove(0);
		a1.clear();
		//编译出错，不允许增加任何元素
//		a4.add(new Object());
		System.out.println(a4.toString());
	}

}
