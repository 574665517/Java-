/**
 *  @author ywx
 *  @ date 2019��3��24��
 */
package �������;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BlackTest02 {
	public static void main(String[] args) {
		//�����߳�
		 final Thread thread = new Thread() {
		 public void run() {
		   //�������ڸ�ʽ
	       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	       
	       while (true) {
	    	   System.out.println("��¼����ʱ��Ϊ��" + dateFormat.format(new Date()));
	    	   try {
	    		   //˯��2*60*60*1000���� = ��Сʱ
                   Thread.sleep(2*60*60*1000);
	    		   } catch (Exception e) {
	    		  e.printStackTrace();
	    		}
	       }
		 }
		 };
		 //���Ӿ���
		 thread.start();
	}
}
