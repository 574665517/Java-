package ��̬����;

public class Student {
	public class ClassLoaderDemo2 {
		public void main(String[] args) {
			Student stu = new Student(); // ʵ�����������
			System.out.println("���������"+ stu.getClass().getClassLoader().getClass().getName());
		}
	}
}
