package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo01 {
	
	/*定义数据库驱动程序*/
	private static final String mysql_driver = "com.mysql.jdbc.Driver";
	/* 数据库连接字符串 */
	private static final String url = "jdbc:mysql://localhost:3306/JavaClassTest";
	/* 数据库连接的用户名 */
	private static final String user = "root";
	/* 数据库连接的密码 */
	private static final String password = "123456";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;//数据流连接
		Statement stmt = null;//数据库操作
		String name = "唐小妹"; // 姓名
		String classid = "1";
		String address="江西南昌";
		String sex = "女";
		String birthday = "2003-08-27";
		// 拼凑出一个完整的SQL语句
		String sql = "INSERT INTO student(studentName,Classid,Address,sex,birthday) "
		+ "VALUES ('" + name + "','"+classid+"','"+address+"','"+ sex +"','" + birthday + "');";
//		String sql = "INSERT INTO student(studentName,Classid,Address,sex,birthday)"
//				+ "VALUES('熊雄',1,'新建县','男','2000-08-27')";
		Class.forName(mysql_driver);//加载数据库驱动
		//连接MYSQL数据库时，要写上连接的用户名和密码
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();//实例化statement对象
		stmt.executeUpdate(sql);//执行数据库更新操作
		System.out.println(conn);
		stmt.close();//操作关闭
		conn.close();//数据库关闭，有异常
	}

}
