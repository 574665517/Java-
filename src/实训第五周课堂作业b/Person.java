package ʵѵ�����ܿ�����ҵb;

/**
 * @author ywx
 * @ date 2019��6��12��
 */
public class Person { // ����Person��
	private String name; // ����name����
	private int age; // ����age����
	
	public Person(String name, int age) { // ͨ������������������
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		// TODO �Զ����ɵĹ��캯�����
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
	public void dealArray(int... intArray){  
        for (int i : intArray) {
        	System.out.print(i + " ");
        }                        
    }  
}
