package 数据库;

import java.sql.*;

/**
 * 获取数据库连接对象
 * @author ywx
 * @ date 2019年6月19日
 */
public class ConnectionTest01 {
	/*定义数据库驱动程序*/
	private static final String mysql_driver = "com.mysql.jdbc.Driver";
	/* 数据库连接字符串 */
	private static final String url = "jdbc:mysql://localhost:3306/JavaClassTest";
	/* 数据库连接的用户名 */
	private static final String user = "root";
	/* 数据库连接的密码 */
	private static final String password = "123456";

	public static void main(String[] args) {
		Connection conn = null;//数据流连接
		try {
			Class.forName(mysql_driver);//加载数据库驱动
			//连接MYSQL数据库时，要写上连接的用户名和密码，有异常
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			conn.close();//数据库关闭，有异常
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
