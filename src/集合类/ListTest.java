package ������;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	/**
	 * �������м��������ַ������͵�ֵ���ټ���һ��Integer���͵�ֵ����Ϊ��ʱlist��Ĭ�ϵ�����ΪObject���ͣ���֮���ѭ����
	 * ����������֮ǰ��list��Ҳ������Integer���͵�ֵ������������ԭ�򣬺����׳�������14�еĴ���
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		/**
		 * ���뷺��д����ֱ���޶���list������ֻ�ܺ���String���͵�Ԫ�أ��Ӷ�����Ҫǿ��ת�����ͣ�
		 * ��Ϊ��ʱ�������Ѿ��ܼ�סԪ�ص�������Ϣ���������Ѿ���ȷ������String������
		 */
		list.add("qqq");
		list.add("sss");
		//list.add(100);
		for(int i = 0; i < list.size(); i++) {
			//String name = (String) list.get(i);
			String name = list.get(i);
			System.out.println("name:" + name);
		}
	}

}
