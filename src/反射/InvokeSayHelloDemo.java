package 反射;

import java.lang.reflect.Method;

/**
 * 调用Person类中的sayHello()方法
 * @author ywx
 * @ date 2019年6月12日
 */
public class InvokeSayHelloDemo {

	public static void main(String[] args) {
		Class<?> c1 = null ; // 声明Class对象
		try {
			c1 = Class.forName("反射.Human");//实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayHello", String.class, int.class);//需要两个参数
			String rv = null;// 接收方法的返回值
			// 调用方法,必须传递对象实例,同时传递两个参数值
			rv = (String)met.invoke(c1.newInstance(), "张无忌", 30);
			System.out.println(rv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
