package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test12 {
	
	//���³���������
	public static void main(String[] args) {
		//Person p = new Person(19);
		//Person p = new Person();
		//p.seeMovie();
	}
	
class Person {
	public Person(int age) {
		if (age < 18) {
		    throw new RuntimeException("����������18�ꡣ");
		}
	}
	public void seeMovie() {
		System.out.println("�����Ƽ���Ӱ");
	}
}
}
