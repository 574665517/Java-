package ������;

/*����ֻ����д��hashCode������û����дequals����
�������󲢲�����ȣ����������hashCode��ȡ�
 */
import java.util.*;
public class HashTest01 {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int hashCode() {
		return i % 10;
	}

	public final static void main(String[] args) {
		HashTest01 a = new HashTest01();
		HashTest01 b = new HashTest01();
		a.setI(1);
		b.setI(1);
		Set<HashTest01> set = new HashSet<HashTest01>();
		set.add(a);
		set.add(b);
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(set);
	}
}

