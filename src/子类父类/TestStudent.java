package ���ุ��;

/**
 * @author ywx
 * @ date 2019��5��23��
 */
public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student("abc");
		String name = student.getName();
	    System.out.println("Name is : " + name);
	    student.setName("efg");
	    name = student.getName();
		System.out.println("Name is : " + name);
	}

}
