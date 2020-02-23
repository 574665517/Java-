package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test3 {

	//三目运算符，前后数类型，如果表达式中有浮点数，结果也是浮点数。
	public static void main(String[] args) {
		int i = 80;
		String s = String.valueOf(i < 100 ? 90 : 100);
		//String s1 = String.valueOf(i < 100 ? 90 : 100.0);
		String s1 = String.valueOf(i < 100 ? 90 : 100);
		System.out.println("两者是否相等：" + s.equals(s1));
	}

}
