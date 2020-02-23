//package 实训第二周课堂作业a;
//
//import java.io.IOException;
//
///**
// * @author ywx
// * @ date 2019年5月24日
// */
//public class Test13 {
//	//异常谜题,子类抛出比父类更大的异常？
//
//	public static void main(String[] args) {
//		try {
//			DBBase base = new MySQLDB();
//		} catch (IOException e) { //异常处理
//		} catch (Exception e) { 
//			e.printStackTrace();
//		}
//class DBBase {// 父类
//		// 父类抛出IOException
//	public DBBase() throws IOException {
//			throw new IOException();
//	}
//}
//class MySQLDB extends DBBase {// 子类
//	// 子类抛出Exception异常
//	public MySQLDB () throws Exception { }
//}
//	}
//}
