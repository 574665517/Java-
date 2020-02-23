package 数据库;

import java.sql.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author ywx
 * @ date 2019年4月21日
 */
class ConnTest extends Conn {

	/**
	 * {@link 数据库.Conn#main(java.lang.String[])} 的测试方法。
	 */
	
	@Test
	void testMain() {
		Conn con = new Conn();
		Connection c = con.getConnection();
		try {
			Statement stmt = c.createStatement();
			 String sql = "insert into customer values('201215128','ly','woman','21','WL')";
			 stmt.executeUpdate(sql);
			 assertNotNull(stmt.executeQuery("Select * from student"));
			 assertEquals(1, stmt.executeQuery("select count(*) from student"));
			 
			 stmt.close();//关操作
			 c.close();//关连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
