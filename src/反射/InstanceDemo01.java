package 反射;

/**
 * @author ywx
 * @ date 2019年6月12日
 */
public class InstanceDemo01 {

	public static void main(String[] args) {
		Class<?> c = null; // 指定泛型
		try { // 传入要实例化类的完整包.类名称
			c = Class.forName("反射.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // 声明Person对象
		try {
			per = (Person) c.newInstance();//实例化Person对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		per.setName("张无忌"); // 设置姓名
		per.setAge(30); // 设置年龄
		System.out.println(per); // 内容输出,调用toString()
	}

}
