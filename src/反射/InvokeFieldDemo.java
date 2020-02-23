package 反射;

import java.lang.reflect.Field;

public class InvokeFieldDemo {
	public static void main(String[] args) throws Exception {
		Class<?> c1 = null; // 声明Class对象
		Object obj = null; // 声明一个对象
		c1 = Class.forName("反射.Human");//实例化Class对象
		obj = c1.newInstance() ; // 实例化对象
		Field nameField = null ; // 表示name属性
		Field ageField = null ; // 表示age属性
		nameField = c1.getDeclaredField("name") ;//取得name属性
		ageField = c1.getDeclaredField("age") ;//取得age属性
		nameField.setAccessible(true);//属性设置成可被外部访问
		nameField.set(obj, "张无忌") ; // 设置name属性内容
		ageField.setAccessible(true) ;//设置成可被外部访问
		ageField.set(obj, 30) ; // 设置age属性内容
		System.out.println("姓名:" + nameField.get(obj));//取得属性内容
		System.out.println("年龄:" + ageField.get(obj));//取得属性内容
	}
}
