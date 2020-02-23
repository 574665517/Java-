package 数据库;

import java.sql.*;

public class QueryDemo02 {
	
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
		Class.forName(mysql_driver);//加载数据库驱动
		String keyWord = "李"; // 设置查询关键字
		String sql = "SELECT studentID as id,studentName,ClassID,Address,sex,Birthday "+
		" FROM student WHERE studentName LIKE ? OR Address LIKE ?";
		conn = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%" + keyWord + "%");//设置第一个“?”,要使用模糊查询
		pstmt.setString(2, "%%");//设置第二个“?”,要使用模糊查询
		ResultSet rs = pstmt.executeQuery(); //执行数据库更新操作
			while(rs.next()) { // 指针向下移动
				int id = rs.getInt(1); // 取得id内容
				String name = rs.getString(2); // 取得name内容
				int cid = rs.getInt(3); // 取得password内容
				String addr = rs.getString(4); // 取得age内容
				String sex = rs.getString(5); // 取得sex内容
				java.util.Date d = rs.getDate(6); // 取得birthday内容
				System.out.print("编号：" + id + "；");
				System.out.print("姓名：" + name + "；");
				System.out.print("地址：" + addr + "；");
				System.out.print("班级：" + cid + "；");
				System.out.print("性别：" + sex + "；");
				System.out.println("生日：" + d);
				System.out.println("---------------------------");
			}
	}

}
