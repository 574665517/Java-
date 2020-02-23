package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test12 {
	
	//以下程序有问题
	public static void main(String[] args) {
		//Person p = new Person(19);
		//Person p = new Person();
		//p.seeMovie();
	}
	
class Person {
	public Person(int age) {
		if (age < 18) {
		    throw new RuntimeException("年龄必须大于18岁。");
		}
	}
	public void seeMovie() {
		System.out.println("看限制级电影");
	}
}
}
