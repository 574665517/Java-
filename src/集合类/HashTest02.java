package ������;
 
/*����ֻ����д��equals����,û����дhashCode����
  �ӽ�����ǿ��Կ����������������ȫ��ȣ�equals��ͬ����
  HashSet�д����������ͬ�Ķ��󣬲�����SetҪ��*/
import java.util.*;
public class HashTest02 {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (object == this) {
			return true;
		}
		if (!(object instanceof HashTest02)) {
			return false;
		}
		HashTest02 other = (HashTest02) object;
		if (other.getI() == this.getI()) {
			return true;
		}
		return false;
	}

	//public int hashCode() {
	//	return i % 10;
	//}

	public final static void main(String[] args) {
		HashTest02 a = new HashTest02();
		HashTest02 b = new HashTest02();
		a.setI(1);
		b.setI(1);
		Set<HashTest02> set = new HashSet<HashTest02>();
		set.add(a);
		set.add(b);
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(set);
	}
}
