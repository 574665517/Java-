package �쳣;
import java.io.*;

/**
 * Ҫ��catchϸ��������һ��Exception���ΰٲ�
 * һ��try�����catch������һ��������
 * @author ywx
 * @ date 2019��12��30��
 */
public class ExceptionExam02 {
	 
	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		int c = 0;
		try {
			//throw new FileNotFoundException("c:\a.txt (ϵͳ�Ҳ���ָ�����ļ���)");
			FileInputStream fin = new FileInputStream("f:/1.dat");
			int cc;
			//throw new ArithmeticException("/by zero");
			a = b / c;
			byte[] buf = new byte[200];//200���ֽڵ�����
			while((cc = fin.read(buf)) != -1){
				for(int i = 0; i < cc; i++){
					System.out.print((char)buf[i]);
				}
			}
		} 
     
		//catch(Exception e){
        //System.out.println("��ȡ�ļ�����");
		// }
		catch(FileNotFoundException e) { 
			System.out.println("message:" + e.getMessage());
			System.out.println("�ļ������ڣ�");
		}
		catch(EOFException e) {
			System.out.println("��д�ļ�β�쳣��");
		}
		catch(IOException e) {
			System.out.println("��ȡ�ļ�����");
		}
 
		catch(ArithmeticException e) {
			System.out.println("message:" + e.getMessage());
			System.out.println("�����쳣������Ϊ��");
		}
		catch(Exception e) {
			System.out.println("��ȡ�ļ�����");
		}
                
		c = a * b;
		System.out.println("a * b =" + c);
		}	
}