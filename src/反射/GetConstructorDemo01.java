package 反射;

import java.lang.reflect.Constructor;

/**
 * @author ywx
 * @ date 2019年6月12日
 */
public class GetConstructorDemo01 {
	public static void main(String[] args) {
		Class<?> c1 = null ; // 声明Class对象
		try {
		c1 = Class.forName("反射.Person");//实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();//全部构造方法
		for (int i = 0; i < con.length; i++) {
			System.out.println("构造方法：" + con[i]);//直接打印输出
		}
	}
}
