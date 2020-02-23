/**
 *  @author ywx
 *  @ date 2020��1��3��
 */
package ����ʵѵ����Ƶ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ��ϣ�������������ϵ����������֮�������
 * ����֮�������
 * ������ͳ�����������ϵ
 * ʵ�ʿ�����Ӧ�����������ڲ�����������ʱ������
 * �����˼·����һ����ʹ�÷������������󣬶�����ʹ��new�ؼ���
 * �ڶ�����ͨ����ȡ�����ļ�����ȡҪ�����Ķ���ȫ�޶�����
 * 
 * @author ywx
 * @ date 2020��1��3��
 */
public class JdbcDemo1 {
	
	public static void main(String[] args) {
		//1ע������
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//2��ȡ����
			Connection conn = DriverManager.getConnection(""
					+ "jdbc:mysql://localhost:3306/test", "root", "123456");
			//3��ȡ�������ݿ�ϵͳ��Ԥ�������
			PreparedStatement pstm = conn.prepareStatement("select * from student");
			//4ִ��sql���õ������
			ResultSet rs = pstm.executeQuery();
			//5���������
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			rs.close();//�ر�������
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
