package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 取得Person类中的属性 —— 取得父类公共属性
 * @author ywx
 * @ date 2019年6月12日
 */
public class GetFieldDemo2 {
	public static void main(String[] args) {
		Class<?> c1 = null ; // 声明Class对象
		try {
			c1 = Class.forName("反射.Human");//实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	{ // 普通代码块
		Field f[] = c1.getFields(); // 取得父类公共属性
		for (int i = 0; i < f.length; i++) {
			Class<?> r = f[i].getType();//属性的类型
			int mo = f[i].getModifiers() ;//取得修饰符数字
			String priv = Modifier.toString(mo);//属性修饰符
			System.out.print("公共属性：");
			System.out.print(priv + " ");// 输出修饰符
			System.out.print(r.getName() + " ");//参数类型
			System.out.print(f[i].getName());//属性名称
			System.out.println(" ;"); // 换行
		}
	}
	}

}
