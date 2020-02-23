package 异常;
import java.io.*;

/**
 * 要把catch细化，不能一个Exception包治百病
 * 一个try，多个catch，呈现一个金字塔
 * @author ywx
 * @ date 2019年12月30日
 */
public class ExceptionExam02 {
	 
	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		int c = 0;
		try {
			//throw new FileNotFoundException("c:\a.txt (系统找不到指定的文件。)");
			FileInputStream fin = new FileInputStream("f:/1.dat");
			int cc;
			//throw new ArithmeticException("/by zero");
			a = b / c;
			byte[] buf = new byte[200];//200个字节的数组
			while((cc = fin.read(buf)) != -1){
				for(int i = 0; i < cc; i++){
					System.out.print((char)buf[i]);
				}
			}
		} 
     
		//catch(Exception e){
        //System.out.println("读取文件出错！");
		// }
		catch(FileNotFoundException e) { 
			System.out.println("message:" + e.getMessage());
			System.out.println("文件不存在！");
		}
		catch(EOFException e) {
			System.out.println("读写文件尾异常！");
		}
		catch(IOException e) {
			System.out.println("读取文件出错！");
		}
 
		catch(ArithmeticException e) {
			System.out.println("message:" + e.getMessage());
			System.out.println("算数异常：除数为零");
		}
		catch(Exception e) {
			System.out.println("读取文件出错！");
		}
                
		c = a * b;
		System.out.println("a * b =" + c);
		}	
}