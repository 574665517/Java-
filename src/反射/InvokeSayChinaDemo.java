package 反射;

import java.lang.reflect.Method;

/**
 * 调用Person类中的sayChina()方法
 * @author ywx
 * @ date 2019年6月12日
 */
public class InvokeSayChinaDemo {

	public static void main(String[] args) {
		Class<?> c1 = null ; // 声明Class对象
		try {
			c1 = Class.forName("范谁.Human");//实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Method met = c1.getMethod("sayChina");//无参数
			met.invoke(c1.newInstance()); //调用方法,必须传递对象实例
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
