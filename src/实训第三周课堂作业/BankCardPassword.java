package 实训第三周课堂作业;

import java.util.Scanner;
/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class BankCardPassword {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入账号：(只能由12至21位数字组成)");
		String name = scanner.next();
		
		System.out.println("请输入密码：(只能有6位)");
		String password = scanner.next();
		
		String regex1 = "\\d{12,21}";//定义字符串长度的\\d{a, b}表示范围，\\d{a}表示大小
		String regex2 = "\\d{6}";
		
		if(!name.matches(regex1)) {
			//运行时异常
			throw new RuntimeException("用户名不符合要求！");
		} else {
			System.out.println("用户名正确！");
		}
		
		if(!password.matches(regex2)) {
			throw new RuntimeException("密码不符合要求！");
		} else {
			System.out.println("密码正确！");
			System.out.println("恭喜："+ name +" 登陆成功！");
		}
	}

}