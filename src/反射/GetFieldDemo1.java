package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 取得Person类中的属性 —— 取得本类属性
 * @author ywx
 * @ date 2019年6月12日
 */
public class GetFieldDemo1 {
	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("反射.Human") ;//实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	{ // 普通代码块
		Field f[] = c1.getDeclaredFields();// 取得本类属性
		for (int i = 0; i < f.length; i++) {// 循环输出
			Class<?> r = f[i].getType();// 取得属性的类型
			int mo = f[i].getModifiers();//修饰符数字
			String priv = Modifier.toString(mo);//修饰符
			System.out.print("本类属性：");
			System.out.print(priv + " ");// 输出修饰符
			System.out.print(r.getName() +" ");//属性类型
			System.out.print(f[i].getName());// 输出属性名
			System.out.println(" ;"); // 换行
		}
	}
	}

}
