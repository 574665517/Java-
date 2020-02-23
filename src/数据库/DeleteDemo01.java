package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo01 {
	
	/*定义数据库驱动程序*/
	private static final String mysql_driver = "com.mysql.jdbc.Driver";
	/* 数据库连接字符串 */
	private static final String url = "jdbc:mysql://localhost:3306/JavaClassTest";
	/* 数据库连接的用户名 */
	private static final String user = "root";
	/* 数据库连接的密码 */
	private static final String password = "123456";

	public static void main(String[] args) throws Exception {
		Connection conn = null; // 数据库连接
		Statement stmt = null; // 数据库操作
		int id = 3; // id
		// 拼凑出一个完整的SQL语句
		String sql = "DELETE FROM student WHERE studentid=" + id;
		Class.forName(mysql_driver); // 加载驱动程序
		// 连接MySQL数据库时,要写上连接的用户名和密码
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();// 实例化Statement对象
		stmt.executeUpdate(sql); // 执行数据库更新操作
		stmt.close(); // 操作关闭
		conn.close(); // 数据库关闭
	}

}
