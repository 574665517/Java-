package ��װ��;

public class Ceshi1 {
	public static void main(String[] args) {
		Ceshi1 temp = new Ceshi1();
		int a = 500;
		//�ֱ𴫵�int���ͺ�Integer����
		temp.f(a);
		temp.f(Integer.valueOf(a));
	}
	public void f(long i) {
        System.out.println("�������Ͳ����ķ���������");
    }
	public void f(Long i) {
        System.out.println("��װ���Ͳ����ķ���������");
    }
}
