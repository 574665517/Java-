/**
 *  @author ywx
 *  @ date 2020年1月3日
 */
package 深圳实训看视频;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 耦合，程序间的依赖关系，包括：类之间的依赖
 * 方法之间的依赖
 * 解耦：降低程序间的依赖关系
 * 实际开发中应该做到编译期不依赖，运行时才依赖
 * 解耦的思路：第一步，使用反射来创建对象，而避免使用new关键字
 * 第二步：通过读取配置文件来获取要创建的对象全限定类名
 * 
 * @author ywx
 * @ date 2020年1月3日
 */
public class JdbcDemo1 {
	
	public static void main(String[] args) {
		//1注册驱动
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//2获取连接
			Connection conn = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/test", "root", "123456");
			//3获取操作数据库系统的预处理对象
			PreparedStatement pstm = conn.prepareStatement("select * from student");
			//4执行sql，得到结果集
			ResultSet rs = pstm.executeQuery();
			//5遍历结果集
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			rs.close();//关闭数据流
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
