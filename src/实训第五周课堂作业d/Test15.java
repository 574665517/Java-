package 实训第五周课堂作业d;

import java.util.HashSet;
import java.util.Set;

/**
 * 下面代码能正确判断相同内容吗？false
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test15 {
	private String firstName, lastName;
	public Test15(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Test15)) {
			return false; 
		}
		Test15 t = (Test15)o;
		return t.firstName.equals(firstName) && t.lastName.equals(lastName);
	}
	public static void main(String[] args) {
		Set<Test15> s = new HashSet<Test15>();//set集合不能有重复元素，HashSet要求不能存储相同的对象
		s.add(new Test15("Mickey", "Mouse"));
		System.out.println(s.contains(new Test15("Mickey", "Mouse")));
	}
}
