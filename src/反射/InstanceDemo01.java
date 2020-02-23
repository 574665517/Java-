package ����;

/**
 * @author ywx
 * @ date 2019��6��12��
 */
public class InstanceDemo01 {

	public static void main(String[] args) {
		Class<?> c = null; // ָ������
		try { // ����Ҫʵ�������������.������
			c = Class.forName("����.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // ����Person����
		try {
			per = (Person) c.newInstance();//ʵ����Person����
		} catch (Exception e) {
			e.printStackTrace();
		}
		per.setName("���޼�"); // ��������
		per.setAge(30); // ��������
		System.out.println(per); // �������,����toString()
	}

}
