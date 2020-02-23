package 集合类;

import java.util.TreeMap;

/**
 * @author ywx
 * @ date 2020年1月6日
 */
public class TreeMapRepeat {

	public static void main(String[] args) {
		//如果仅把此处的TreeMap换成HashMap，则size = 1
		TreeMap map = new TreeMap();
		map.put(new Key(), "value one");
		map.put(new Key(), "value two");
		//TreeMap.size = 2,因为Key去重规则是根据排序结果
		System.out.println(map.size());
		System.out.println(map);
	}
}
class Key implements Comparable<Key> {

	//返回负的常数，表示此对象永远小于输入的other对象，此处决定TreeMap的size = 2
	@Override
	public int compareTo(Key other) {
		return -1;
	}
	
	//hash是相等的
	public int hashMap() {
		return 1;
	}
	
	//equals比较也是相等的
	public boolean equals(Object obj) {
		return true;
	}
}
