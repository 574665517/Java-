package ������;

import java.util.TreeMap;

/**
 * @author ywx
 * @ date 2020��1��6��
 */
public class TreeMapRepeat {

	public static void main(String[] args) {
		//������Ѵ˴���TreeMap����HashMap����size = 1
		TreeMap map = new TreeMap();
		map.put(new Key(), "value one");
		map.put(new Key(), "value two");
		//TreeMap.size = 2,��ΪKeyȥ�ع����Ǹ���������
		System.out.println(map.size());
		System.out.println(map);
	}
}
class Key implements Comparable<Key> {

	//���ظ��ĳ�������ʾ�˶�����ԶС�������other���󣬴˴�����TreeMap��size = 2
	@Override
	public int compareTo(Key other) {
		return -1;
	}
	
	//hash����ȵ�
	public int hashMap() {
		return 1;
	}
	
	//equals�Ƚ�Ҳ����ȵ�
	public boolean equals(Object obj) {
		return true;
	}
}
