//package ʵѵ�ڶ��ܿ�����ҵa;
//
//import java.io.IOException;
//
///**
// * @author ywx
// * @ date 2019��5��24��
// */
//public class Test13 {
//	//�쳣����,�����׳��ȸ��������쳣��
//
//	public static void main(String[] args) {
//		try {
//			DBBase base = new MySQLDB();
//		} catch (IOException e) { //�쳣����
//		} catch (Exception e) { 
//			e.printStackTrace();
//		}
//class DBBase {// ����
//		// �����׳�IOException
//	public DBBase() throws IOException {
//			throw new IOException();
//	}
//}
//class MySQLDB extends DBBase {// ����
//	// �����׳�Exception�쳣
//	public MySQLDB () throws Exception { }
//}
//	}
//}
