package 集合类;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	/**
	 * 先向其中加入两个字符串类型的值，再加入一个Integer类型的值，因为此时list、默认的类型为Object类型，在之后的循环中
	 * 由于忘记了之前在list中也加入了Integer类型的值或者其他编码原因，很容易出现类似14行的错误
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		/**
		 * 加入泛型写法后，直接限定了list集合中只能含有String类型的元素，从而不需要强制转换类型，
		 * 因为此时，集合已经能记住元素的类型信息，编译器已经能确定它是String类型了
		 */
		list.add("qqq");
		list.add("sss");
		//list.add(100);
		for(int i = 0; i < list.size(); i++) {
			//String name = (String) list.get(i);
			String name = list.get(i);
			System.out.println("name:" + name);
		}
	}

}
