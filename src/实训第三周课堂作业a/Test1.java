package ʵѵ�����ܿ�����ҵa;
/**
* null�����Ƕ���
* Ҳ����Objcet��ʵ��null������Ȼ�ܴ���һ����ȷ���Ķ���
* * ����null������˵�������Ƕ���Ҳ��֪��ʲô���ͣ�Ҳ����java.lang.Object��ʵ����
* @param args
*/
public class Test1 {//�������ִ�н���ǣ�Double array
	public static void main(String[] args) {
		new Test1(null);//Test1�ں���������null,null���Ƕ���Ҳ����Objectʵ��
	}
	private Test1(Object o) {//���캯������
		System.out.println("Object");
	}
	private Test1(double[] doubleArray) {
		System.out.println("Double array");
	}
}
