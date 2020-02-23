package 数据库;

import java.sql.*;

public class Conn {
	//静态全局变量放在堆中，太占内存，不实用
	Connection con;
	//定义数据库驱动程序
		private static final String mysql_driver = "com.mysql.jdbc.Driver";
		/* 数据库连接字符串 */
		private static final String url = "jdbc:mysql://localhost:3306/test";
		/* 数据库连接的用户名 */
		private static final String user = "root";
		/* 数据库连接的密码 */
		private static final String password = "123456";
		
    public Connection getConnection() {
	  try {
		 Class.forName(mysql_driver); 
		 System.out.println("数据库驱动类加载成功");
	  } catch(ClassNotFoundException e) {
		 e.printStackTrace();
	  }
	  try { //通过访问数据库的url获取数据库连接对象
         con = DriverManager.getConnection(url,user,password);
		 System.out.println("数据库连接成功");
		 Statement stmt = con.createStatement();//执行SQL语句
		 ResultSet rs = stmt.executeQuery("Select * from student");//遍历结果集就是一个表
		 String sno = null;
		 String sname = null;
		 String ssex = null;
		 int sage = 0;
		 String sdept = null;
		 while(rs.next()) {//结果集指针指向当前记录的上一条
			sno = rs.getString(1);
			sname = rs.getString(2);
			ssex = rs.getString(3);
			sage = rs.getInt(4);
			sdept = rs.getString(5);
			System.out.println(sno + "\t" + sname + "\t" + ssex + "\t"+ sage + "\t" + sdept);
		 }
		 rs.close();//关结果集
         stmt.close();//关操作
		 con.close();//关连接
	  } catch(SQLException e) {
		 e.printStackTrace();
		 System.out.println("找不到驅動程序類，加載驅動失敗");
	  }
	return con;
}

	public static void main(String[] args) {
		Conn c = new Conn();
		c.getConnection();
	}
}
