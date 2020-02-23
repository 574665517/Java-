package 数据库;

import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;

public class Wuliu {
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
	   } catch(ClassNotFoundException e) {
		  e.printStackTrace();
	   }
	   try { //通过访问数据库的url获取数据库连接对象
          con = DriverManager.getConnection(url,user,password);
		  System.out.println("数据库连接成功");
		  Statement stmt = con.createStatement();//执行SQL语句
		  ResultSet rs = stmt.executeQuery("Select * from data");
		  
		  String bill = null;//出库配账单号
		  String type = null;//钢种规格
//		  int count = 0;
		  while(rs.next()) {
			  bill = rs.getString(2);//数据库数据的第二属性
			  type = rs.getString(10);//数据库数据的第十属性
			 
			System.out.println(bill + "\t" + type + "\t" );
			  
//			  String[] a = new String[bill.length()];
//			  String[] b = new String[type.length()];
//			  for(int i = 0;i < bill.length() - 1;i++) {
//				  if(a[i].equals(a[i+1])) {
//					  for(int j = 0;j < type.length() - 1;j++) {
//						  if(b[j].equals(b[j+1])) {
//							  count++;
//							  System.out.println(a[i] + b[j]);
//						  }
//					  }
//				  }
//			  }//空指针异常
			  
//			  if(a[bill.length()].equals(a[bill.length() + 1])) {//空指针异常
//				  if(b[type.length()].equals(b[type.length() + 1])) {
//					  System.out.println(a[bill.length()].toString() + "\t" + b[type.length()].toString());
//				  }
//			  }
			  //List<String> list = new ArrayList<String>();
			  //list.add(bill);
			  //list.add(type);
			  //System.out.println(list);
			  //System.out.println(bill + "\t" + type + "\t" );
		}
		   rs.close();
           stmt.close();
		   con.close();
	    } catch(SQLException e) {
		   e.printStackTrace();
		   System.out.println("找不到驅動程序類，加載驅動失敗");
	}
}

	public static void main(String[] args) {
		Wuliu c = new Wuliu();
		c.getConnection();
	}
}

