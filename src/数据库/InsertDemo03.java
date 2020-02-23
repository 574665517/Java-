package 数据库;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class InsertDemo03 {
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		Connection conn = null; // 数据库连接
		PreparedStatement pstmt = null;// 数据库操作
		String name = "李青霞"; // 姓名
		int classid = 122;
		String address = "四川重庆";
		String sex = "女";
		String birthday = "1963-05-27";
		java.util.Date temp = null; // 声明一个Date对象
		// 通过SimpleDateFormat类将字一个字符串变为java.util.Date类型
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		// 通过java.util.Date取出具体的日期数,并将其变为java.sql.Date类型
		java.sql.Date bir = new java.sql.Date(temp.getTime());
		String sql = "INSERT INTO user(name,password,age,sex,birthday) "
		+ " VALUES (?,?,?,?,?)"; // 编写预处理SQL
		pstmt = conn.prepareStatement(sql); // 实例化PreparedStatement
		pstmt.setString(1, name); // 设置第一个“?”的内容
		pstmt.setInt(2,classid); // 设置第二个“?”的内容
		pstmt.setString(3,address); // 设置第三个“?”的内容
		pstmt.setString(4,sex); // 设置第四个“?”的内容
		pstmt.setDate(5,bir); // 设置第五个“?”的内容
		pstmt.executeUpdate(); // 执行数据库更新操作,不需要sql
		pstmt.close(); // 操作关闭
		conn.close(); // 数据库关闭
	}

}
