package 实训第五周课堂作业c;

import 实训第五周课堂作业c.Person;

/**
 * 使用@Override 运行结果：报错不使用：这是一个Person类
注意：@Override只能在方法上应用,不能在其他元素如类、属性上使用
 * @author ywx
 * @ date 2019年6月13日
 */
class Person { // 定义Person类
	public String getInfo() { // 定义getInfo()方法
		return "这是一个Person类。" ; // 返回信息
	}
}
class Student extends Person { // 子类继承父类
	@Override // 此处明确的指出方法覆写操作
	public String getInfo() { // 此处将方法名称写错
		return "这是一个Student类。";
	}
}
public class OverrideAnnotationDemo01 {
	public static void main(String[] args) {
		Person per = new Student() ;//通过子类实例化父类对象
		System.out.println(per.getInfo()) ;//输出信息
	}//运行结果：这是一个Student类
}