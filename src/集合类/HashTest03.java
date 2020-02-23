package 集合类;

/*我们重写了hashCode方法和equals方法
  从结果我们可以看出，现在两个对象就完全相等了，
  HashSet中也只存放了一份对象。*/
import java.util.*;
public class HashTest03 {
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
		if (!(object instanceof HashTest03)) {
			return false;
		}
		HashTest03 other = (HashTest03) object;
		if (other.getI() == this.getI()) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return i % 10;
	}

	public final static void main(String[] args) {
		HashTest03 a = new HashTest03();
		HashTest03 b = new HashTest03();
		a.setI(1);
		b.setI(1);
		Set<HashTest03> set = new HashSet<HashTest03>();
		set.add(a);
		set.add(b);
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(set);
	}
}
