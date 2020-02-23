package 数据库;

import java.sql.*;

/**
 * @author ywx
 * @ date 2019年4月13日
 */
public class ConnInsert {
	Connection con;
	//定义数据库驱动程序
		private static final String mysql_driver = "com.mysql.jdbc.Driver";
		/* 数据库连接字符串 */
		private static final String url = "jdbc:mysql://localhost:3306/test";
		/* 数据库连接的用户名 */
		private static final String user = "root";
		/* 数据库连接的密码 */
		private static final String password = "123456";

		
		private void getConnection() {
			try {
				Class.forName(mysql_driver);
				System.out.println("数据库驱动类加载成功");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try { //通过访问数据库的url获取数据库连接对象
		         con = DriverManager.getConnection(url,user,password);
				 System.out.println("数据库连接成功");
				 Statement stmt = con.createStatement();//创建一个Statement对象
				 //刷新的sql语句
				 String sql = "insert into student values('201215127','xx','man','20','CS')";
				//建立PreparedStatement对象
				 PreparedStatement pst = con.prepareStatement(sql);
		         pst.executeUpdate();
		            
				 ResultSet rs = stmt.executeQuery("Select * from student");//结果集就是一个表
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
		}
		
		public static void main(String[] args) {
			ConnInsert c = new ConnInsert();
			c.getConnection();	
		}
}
