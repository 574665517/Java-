package ����;

/**
 * @author ywx
 * @ date 2019��6��12��
 */
public class Person { // ����Person��
	private String name; // ����name����
	private int age; // ����age����
	
	public Person(String name, int age) { // ͨ������������������
		this.setName(name); // ����name��������
		this.setAge(age); // ����age��������
	}
	
	public String getName() { // ȡ��name����
		return name;
	}
	public void setName(String name) { // ����name����
		this.name = name;
	}
	public int getAge() { // ȡ��age����
		return age;
	}
	public void setAge(int age) { // ����age����
		this.age = age;
	}
	public String toString() { // ��дtoString()����
		return "������" + this.name + ",���䣺" + this.age;
	}
}
