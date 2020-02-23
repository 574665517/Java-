package 数据库1;

import java.sql.*;

public class GetGeneratedKeyTest {
	public static void main(String[] args) {
		try {
			Connection conn = JdbcUtil.getConnection();
			String sql = "insert into user(name,password,email,birthday)values('abc','123','abc@sina.com','1978-08-08')";
			PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			st.executeUpdate();
			//得到插入行的主键
			ResultSet rs = st.getGeneratedKeys();
			if (rs.next())
				System.out.println(rs.getObject(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}