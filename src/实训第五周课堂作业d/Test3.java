package ʵѵ�����ܿ�����ҵd;

import java.util.List;

/**
 * ����ʲôʱ����ʲôͨ�����
 * ͨ���ֻ��������һ������ʱ���õ���ʹ�����ɷ�������ð����˶������͵ķ���
 * @author ywx
 * @ date 2019��6��14��
 */

public class Test3 {
	public static void main(String[] args) {
//		List<Integer> list = null;
//		read(list);
	}
	@SuppressWarnings("unused")
	                            //List<? super E> list
	public static <E> void read(List<? extends E> list) {//�ϱ�ͨ�������߲�����E��ֻ������
		                        //?����E�����ͻ����������� extends�۳���E
		int sum = 0;
		for (E obj : list) {
			// ҵ���߼�����
		}
	}
	                         //List<? extends Number> list
	public static void write(List<? super Number> list) {//�±�ͨ�������Ͳ�����Number��ֻ����д
		                     //�������������Number���ͻ�Number�ĸ����� 
		// ����һ��Ԫ��
		list.add(123L);//Integer��Number��������
	}
}
