package ʵѵ�����ܿ�����ҵd;

/**
 * ����Ŀ���2-1
 * ����ӵĸ�����Сͷ�ְ�
С���ӵĸ�����Сͷ�ְ�
 * @author ywx
 * @ date 2019��6��14��
 */

public class Person implements Cloneable {//��¡�ı�־���ӿ�
	// ����
	private String name;
	// ����
	private Person father;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, Person father) {
		super();
		this.name = name;
		this.father = father;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	//ʵ�ֿ���

	@Override
	public Person clone() {//ʵ�����¡
		Person p = null;
	try {
		p = (Person)super.clone();
		p.setFather(new Person(p.getFather().getName()));
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return p;
}
	
	/* name��parent��getter/setter����ʡ�� */
	public static void main(String[] args) throws Exception {
		Person f = new Person("Сͷ�ְ�");// ���常��
		Person s1 = new Person("�����", f);// ��������
		System.out.println(s1.getFather());//s1�ĸ���
		// С���ӵ���Ϣ��ͨ������ӿ���������
		Person s2 = (Person)s1.clone();
		System.out.println(s2.getFather());//s2�ĸ���
		s2.setName("С����");
		System.out.println(s1.getName() + "�ĸ�����" + s1.getFather().getName());
		System.out.println(s2.getName() + "�ĸ�����" + s2.getFather().getName());
	}
	
}
