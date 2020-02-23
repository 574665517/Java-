package 数据库;

import java.sql.*;
import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年4月10日
 */
public class LoginSafe {
	
	private static final String mysql_driver = "com.mysql.jdbc.Driver";
	/* 数据库连接字符串 */
	private static final String url = "jdbc:mysql://localhost:3306/test";
	/* 数据库连接的用户名 */
	private static final String user = "root";
	/* 数据库连接的密码 */
	private static final String password = "123456";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//输入用户名密码
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入账号：");
		String name = scanner.nextLine();
		System.out.println("请输入密码：");
		String pwd = scanner.nextLine();
		
		//到数据库检验密码是否正确
		try {
			//加载数据库驱动类
			Class.forName(mysql_driver);
			//连接到数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			//执行SQL语句
			String sql = "select * from login where username = ? and password = ?";
			//执行SQL语句
			PreparedStatement state = conn.prepareStatement(sql);//容器
			state.setString(1, name);//将第n个值替换成某个值
			state.setString(2, pwd);
			//结果集就是一个表
			ResultSet rs = state.executeQuery();
			
			//输出：正确显示欢迎，不正确显示错误
			if(rs.next()) {
				System.out.println("登录成功！" + rs.getString(2) + " 欢迎你");
			} else {
				System.out.println("登录失败");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
