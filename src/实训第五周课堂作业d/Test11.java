package ʵѵ�����ܿ�����ҵd;

/**
 * �������ִ�����ʲô,Ϊʲô��
Hello B
Hello C
Hello I
 * @author ywx
 * @ date 2019��6��14��
 */
interface Inter { }
class A { }
	class B extends A implements Inter { }
	public class Test11 extends B {	
		public static void main(String[] args) {
			A a = new A();
			B b = new B();
			Test11 c = new Test11();
			/**
			 * java �е�instanceof �����������������ʱָ�������Ƿ����ض����һ��ʵ����
			 * ʹ�� instanceof �����ж�һ��ʵ���Ƿ�����ĳ�����͡�
			 * instanceofͨ������һ������ֵ��ָ������������Ƿ�������ض�����������������һ��ʵ����
			 */
			if (a instanceof B) {//a���࣬a����B�����ͣ��������
				System.out.println("Hello A");
			}
			if (b instanceof A) {//�����Ǹ��������
				System.out.println("Hello B");
			}
			if (c instanceof Test11) {//c��Test11������
				System.out.println("Hello C");
			}
			if (c instanceof Inter) {//c�ǽӿڵ�����
				System.out.println("Hello I");
			}
		}
}
