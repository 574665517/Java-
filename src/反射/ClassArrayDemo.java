package 反射;

import java.lang.reflect.Array;

/**
 * 取得数组信息并修改数组内容
 * @author ywx
 * @ date 2019年6月12日
 */
public class ClassArrayDemo {
	public static void main(String[] args) throws Exception {
		int temp[] = {1, 2, 3} ; // 声明一个整型数组
		//取得数组的Class对象
		Class<?> c = temp.getClass().getComponentType();
		System.out.println("类型：" + c.getName());//得到数组类型名
		//得到数组长度
		System.out.println("长度：" + Array.getLength(temp));
		//得到第一个内容
		System.out.println("第一个内容：" + Array.get(temp, 0));
		Array.set(temp, 0, 6); //修改第一个内容
		//得到第一个内容
		System.out.println("第一个内容：" + Array.get(temp, 0));
	}

}
