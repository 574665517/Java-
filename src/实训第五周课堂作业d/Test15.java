package ʵѵ�����ܿ�����ҵd;

import java.util.HashSet;
import java.util.Set;

/**
 * �����������ȷ�ж���ͬ������false
 * @author ywx
 * @ date 2019��6��14��
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
		Set<Test15> s = new HashSet<Test15>();//set���ϲ������ظ�Ԫ�أ�HashSetҪ���ܴ洢��ͬ�Ķ���
		s.add(new Test15("Mickey", "Mouse"));
		System.out.println(s.contains(new Test15("Mickey", "Mouse")));
	}
}
