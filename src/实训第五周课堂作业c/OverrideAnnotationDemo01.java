package ʵѵ�����ܿ�����ҵc;

import ʵѵ�����ܿ�����ҵc.Person;

/**
 * ʹ��@Override ���н��������ʹ�ã�����һ��Person��
ע�⣺@Overrideֻ���ڷ�����Ӧ��,����������Ԫ�����ࡢ������ʹ��
 * @author ywx
 * @ date 2019��6��13��
 */
class Person { // ����Person��
	public String getInfo() { // ����getInfo()����
		return "����һ��Person�ࡣ" ; // ������Ϣ
	}
}
class Student extends Person { // ����̳и���
	@Override // �˴���ȷ��ָ��������д����
	public String getInfo() { // �˴�����������д��
		return "����һ��Student�ࡣ";
	}
}
public class OverrideAnnotationDemo01 {
	public static void main(String[] args) {
		Person per = new Student() ;//ͨ������ʵ�����������
		System.out.println(per.getInfo()) ;//�����Ϣ
	}//���н��������һ��Student��
}