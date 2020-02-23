package ����;

import java.util.ArrayList;
import java.util.List;

/**
 * ���͵ı��������Ͳ������������ȷ������������͵����⣬
 * ���Ϳ��Զ������ࡢ�ӿڡ������У�������ͨ��ʶ������źͼ������ڵ���ĸ����������
 * <String, T, Alibaba>
 * @author ywx
 * @ date 2019��12��29��
 */
public class ListNoGeneric {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add(new Object());
		a1.add(new Integer(111));
		a1.add(new String("hello a1a1"));
		System.out.println(a1.toString());
		
		//�ڶ��Σ���a1���ø�ֵ��a2��ע��a2��a1�������������˷�������<Object>
		List<Object> a2 = a1;
		a2.add(new Object());
		a2.add(new Integer(222));
		a2.add(new String("hello a2a2"));
		System.out.println(a2.toString());
		
		//�����Σ���a1���ø�ֵ��a3��ע��a3��a1�������������˷���<Integer>
		List<Integer> a3 = a1;
		a3.add(new Integer(333));
		//�·����б��������������ӷ�Integer���ͽ��뼯��
//		a3.add(new String("hello a3a3"));
//		a3.add(new Object());
		System.out.println(a3.toString());
		
		//���ĶΣ���a1���ø�ֵ��a4��ע��a4��a1��������������ͨ���
		List<?> a4 = a1;
		//����ɾ����ȡ��Ԫ��
		a1.remove(0);
		a1.clear();
		//������������������κ�Ԫ��
//		a4.add(new Object());
		System.out.println(a4.toString());
	}

}
