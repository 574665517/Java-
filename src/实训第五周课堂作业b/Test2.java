package ʵѵ�����ܿ�����ҵb;

import java.lang.reflect.Array;

public class Test2 {
	
	int dealArray() {
		int d1 = (int) (Math.random() * 1000);
		return d1;
	}
	public static void main(String[] args) throws Exception {
		int temp[] = {1, 2, 3} ; // ����һ����������
		//ȡ�������Class����
		Class<?> c = temp.getClass().getComponentType();
		System.out.println("���ͣ�" + c.getName());//�õ�����������
		//�õ����鳤��
		System.out.println("���ȣ�" + Array.getLength(temp));
		//�õ���һ������
		System.out.println("��һ�����ݣ�" + Array.get(temp, 0));
		Array.set(temp, 0, 6); //�޸ĵ�һ������
		//�õ���һ������
		System.out.println("��һ�����ݣ�" + Array.get(temp, 0));
	}

}
