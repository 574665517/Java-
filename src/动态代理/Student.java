package 动态代理;

public class Student {
	public class ClassLoaderDemo2 {
		public void main(String[] args) {
			Student stu = new Student(); // 实例化子类对象
			System.out.println("类加载器："+ stu.getClass().getClassLoader().getClass().getName());
		}
	}
}
