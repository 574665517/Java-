package ������;

/*
 *���洢Ԫ��ʵ����comparable�ӿ�
  TreeSet�����������Ԫ�ص�ʱ�򣬻����
  comparaTo����������ɱȽϣ�
*/
import java.util.*;
public class SortedSetTest01 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SortedSet ss=new TreeSet();//TreeSetʵ����SortedSet�ӿ�
		ss.add("drf");
		ss.add("abc");
		ss.add("b");
		ss.add("ccc");
		System.out.println(ss);
		Iterator it = ss.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
