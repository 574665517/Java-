package ����;

interface China { // ����China�ӿ�
	public static final String NATIONAL = "China"; // ����ȫ�ֳ���
	public static final String AUTHOR = "���޼�";// ����ȫ�ֳ���
	public void sayChina(); // �����޲εĳ��󷽷�
	public String sayHello(String name, int age);// �����вεĳ��󷽷�
}

	public class Human implements China { // ����Person��ʵ�ֽӿ�
		private String name; // ����name����
		private int age; // ����age����
		public Human() { // �����޲ι���
		}
		public Human(String name) { // ������һ�������Ĺ��췽��
			this.setName(name) ; // Ϊname���Ը�ֵ
		}
		public Human(String name, int age) {// ���������������Ĺ��췽��
			this(name); // ������һ�������Ĺ���
			this.setAge(age); // Ϊage���Ը�ֵ
		}// setter��getter
		public void sayChina() { // ��д���������Ϣ
			System.out.println("���ߣ�" + AUTHOR + ",������" + NATIONAL);
		}
		public String sayHello(String name, int age) { // ��д����,������Ϣ
			return name + ",��ã��ҽ���" + age + "���ˣ�";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}