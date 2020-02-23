package 实训第二周课堂多态;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Test {

	public static void main(String[] args) {
		Person test = new Person();
		test.dance();
		test.start();
		Car test1 = new Car();
		test1.fillFuel();
		test1.crack();
		test1.start();
		Bird test2 = new Bird();
		test2.fly();
		test2.start();
	}

}
