package string类型;

public class StrChange {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello java");
		s1.length();
		System.out.println(s1);
		s1.replace(1, 5, "i");// 用str代替从start到end-1之间的所有字符
		System.out.println(s1);
		s1.delete(0, 3);// 删除从shart到end-1之间所有字符
		System.out.println(s1);
		s1.reverse();// 接收者字符逆转
		System.out.println(s1);
		s1.setLength(1);// 设置字符串长度
		System.out.println(s1);
		s1.capacity();// 返回字符串对象的容量
		System.out.println(s1);
		s1.append(10);
		System.out.println(s1);

	}

}
