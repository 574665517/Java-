package 数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class QueryDemo01 {
	
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
		Class.forName(mysql_driver);//加载数据库驱动
		Statement stmt = null;//数据库操作
		ResultSet rs = null ; // 保存查询结果
		String sql = "SELECT studentid,studentName,Classid,Address,sex,Birthday FROM student";
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();// 实例化Statement对象
		rs = stmt.executeQuery(sql);// 实例化ResultSet对象
		while(rs.next()) { // 指针向下移动
			int id = rs.getInt("studentid"); // 取得id内容
			String name = rs.getString("studentName");// 取得name内容
			String addr = rs.getString("Address");
			int cid = rs.getInt("Classid") ;
			String sex = rs.getString("sex"); // 取得sex内容
			Date d = rs.getDate("birthday");//取得birthday内容
			System.out.print("编号：" + id + "；");// 输出编号
			System.out.print("姓名：" + name + "；");//输出姓名
			System.out.print("地址：" + addr + "；");//输出地址
			System.out.print("班级：" + cid + "；");//输出年龄
			System.out.print("性别：" + sex + "；");//输出性别
			System.out.println("生日：" + d);//输出生日
			System.out.println("-----------------------");//换行
		}
		rs.close() ; // 关闭结果集
		stmt.close() ; // 操作关闭
		conn.close() ; // 数据库关闭
	}
}

