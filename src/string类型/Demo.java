package string类型;

import java.util.Scanner;

public class Demo {

	private void Demo01() {
		String s1 = "xoxx1";
		String s2 = "xoxx1";
		String s3 = "XoXx1";

		// 区分大小写
		System.out.println(s1.equals(s2));// true
		System.out.println(s2.equals(s3));// false

		System.out.println("------------");

		// 忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2));// true
		System.out.println(s2.equalsIgnoreCase(s3));// true

		System.out.println("------------");
	}

	private void Demo02() {
		String s1 = "关注xoxx1,森别";
		String s2 = "xoxx1";
		String s3 = "xqxx1";
		String s4 = "关注";
		String s5 = "森别";

		// 判断是否包含传入的字符串
		System.out.println(s1.contains(s2));// true
		System.out.println(s1.contains(s3));// false

		// 判断是否以某个指定的字符串开头
		System.out.println("-----------");
		System.out.println(s1.startsWith(s4));// true
		System.out.println(s1.startsWith(s5));// false

		// 判断是否以某个指定的字符串结尾
		System.out.println("-----------");
		System.out.println(s1.endsWith(s4));// false
		System.out.println(s1.endsWith(s5));// true

		System.out.println("-----------");
	}

	private void Demo03() {
		String s1 = "xoxx1";
		String s2 = "";
		//String s3 = null;

		// 判断字符串是否为空
		System.out.println(s1.isEmpty());// false
		System.out.println(s2.isEmpty());// true
		//System.out.println(s3.isEmpty());// java.lang.NullPointerException

		System.out.println("-----------");
	}

	@SuppressWarnings("resource")
	private void Demo04() {
		Scanner sc = new Scanner(System.in);// 创建键盘输入对象
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用户名：");
			String userName = sc.nextLine();// 输出的用户名存储在userName中
			System.out.println("请输入密码：");
			String passWord = sc.nextLine();// 输入的密码存储在passWord中

			// 采用字符串常量调用方法，将变量当做参数传递，防止空指针异常
			if ("admin".equals(userName) && "123".equals(passWord)) {
				System.out.println("当前用户" + userName + "登陆成功！");
				break;
			} else {
				if (i == 2) {
					System.out.println("您当前已经输错了三次用户名或密码，账号已经被封锁，请联系熊雄！");
				} else {
					System.out.println("用户名或密码错误，还可尝试" + (2 - i) + "次机会");
				}
			}
		}
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.Demo01();
		demo.Demo02();
		demo.Demo03();
		demo.Demo04();
	}
}
