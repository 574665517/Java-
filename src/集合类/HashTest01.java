package 集合类;

/*我们只是重写了hashCode方法，没有重写equals方法
两个对象并不是相等，两个对象的hashCode相等。
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

