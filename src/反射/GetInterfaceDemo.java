package 反射;

/**
 * 取得Person类实现的全部接口
 * @author ywx
 * @ date 2019年6月12日
 */
public class GetInterfaceDemo {
	public static void main(String[] args) {
		Class<?> c1 = null ; // 声明Class对象
		try {// 实例化Class对象
			c1 = Class.forName("反射.Human") ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces();// 取得实现的全部接口
		for(int i = 0; i < c.length; i++) {
		// 输出接口名称
		System.out.println("实现的接口名称："+ c[i].getName());
		}
	}
}
