package 反射;

/**
 * @author ywx
 * @ date 2019年6月12日
 */
public class Person { // 定义Person类
	private String name; // 定义name属性
	private int age; // 定义age属性
	
	public Person(String name, int age) { // 通过构造设置属性内容
		this.setName(name); // 设置name属性内容
		this.setAge(age); // 设置age属性内容
	}
	
	public String getName() { // 取得name属性
		return name;
	}
	public void setName(String name) { // 设置name属性
		this.name = name;
	}
	public int getAge() { // 取得age属性
		return age;
	}
	public void setAge(int age) { // 设置age属性
		this.age = age;
	}
	public String toString() { // 覆写toString()方法
		return "姓名：" + this.name + ",年龄：" + this.age;
	}
}
