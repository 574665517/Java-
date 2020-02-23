package 反射;

interface China { // 定义China接口
	public static final String NATIONAL = "China"; // 定义全局常量
	public static final String AUTHOR = "张无忌";// 定义全局常量
	public void sayChina(); // 定义无参的抽象方法
	public String sayHello(String name, int age);// 定义有参的抽象方法
}

	public class Human implements China { // 定义Person类实现接口
		private String name; // 定义name属性
		private int age; // 定义age属性
		public Human() { // 声明无参构造
		}
		public Human(String name) { // 声明有一个参数的构造方法
			this.setName(name) ; // 为name属性赋值
		}
		public Human(String name, int age) {// 声明有两个参数的构造方法
			this(name); // 调用有一个参数的构造
			this.setAge(age); // 为age属性赋值
		}// setter、getter
		public void sayChina() { // 覆写方法输出信息
			System.out.println("作者：" + AUTHOR + ",国籍：" + NATIONAL);
		}
		public String sayHello(String name, int age) { // 覆写方法,返回信息
			return name + ",你好！我今年" + age + "岁了！";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}