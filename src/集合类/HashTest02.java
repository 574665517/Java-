package 集合类;
 
/*我们只是重写了equals方法,没有重写hashCode方法
  从结果我们可以看出，两个对象就完全相等（equals相同），
  HashSet中存放了两份相同的对象，不符合Set要求*/
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
