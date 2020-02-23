package 反射;

class S { // 定义S类
}
	public class GetClassDemo02 {
		public static void main(String args[]) {
			Class<?> c1 = null; // 指定泛型
			Class<?> c2 = null; // 指定泛型
			Class<?> c3 = null; // 指定泛型
			try {
				//最常用的形式
				c1 = Class.forName("反射.GetClassDemo01");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			c2 = new S().getClass();// 通过Object类中的方法实例
			c3 = S.class; // 通过类.class实例化
			System.out.println("类名称：" + c1.getName());//类的名称
			System.out.println("类名称：" + c2.getName());//类的名称
			System.out.println("类名称：" + c3.getName());//类的名称
		}
	}	
