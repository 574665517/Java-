package ������;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		List <String> allList = null ; // ����List����
		allList = new ArrayList<String>();
		System.out.println("���ϲ���ǰ�Ƿ�Ϊ�գ�" + allList.isEmpty());
		allList.add("Hello"); // ����Ԫ��
		allList.add(0, "World");
		allList.add("zhangwuji");
		allList.add("www.chuanxi.com");
		System.out.println(allList.contains("Hello") ? "\"Hello\"�ַ������ڣ�" : "\"Hello\"�ַ��������ڣ�");
		List<String> allSub = allList.subList(2, 3);//ȡ�����ּ���
		System.out.print("���Ͻ�ȡ��");
		for (int i = 0; i < allSub.size(); i++){// ��ȡ���ּ���
			System.out.print(allList.get(i) + "��");
		}
		System.out.println("") ;
		System.out.println("World�ַ�����λ�ã�" + allList.indexOf("World"));
		System.out.println("���ϲ������Ƿ�Ϊ�գ�" + allList.isEmpty());
	}
}
