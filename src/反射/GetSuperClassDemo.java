package 反射;

/**
 * 取得Person的父类
 * @author ywx
 * @ date 2019年6月12日
 */
public class GetSuperClassDemo {
	public static void main(String[] args) {
		Class<?> c1 = null ; // 声明Class对象
		try {// 实例化Class对象
			c1 = Class.forName("javax.swing.JFrame");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass(); // 取得父类
		Class<?> c3 = c2.getSuperclass();
		System.out.println("父类名称：" + c2.getName());// 输出信息
		System.out.println("父类的父类名称：" + c3.getName());
	}
}
