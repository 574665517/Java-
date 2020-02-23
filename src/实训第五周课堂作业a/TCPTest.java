package ʵѵ�����ܿ�����ҵa;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019��6��11��
 */
public class TCPTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			int i = 1;
			ServerSocket serverSocket = new ServerSocket(8080);
			while(true) {
				//�ȴ��ͻ���ͨ���˿�8001���������
				Socket socket = serverSocket.accept();
				System.out.println("xiongxiong" + i);
				Runnable runnable = new TCPTest01(socket);
				Thread thread = new Thread(runnable);
				thread.start();
				i++;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class TCPTest01 implements Runnable {

	private Socket incomingSocket;
	
	public TCPTest01(Socket in){
		incomingSocket = in;
	}
	
	@SuppressWarnings("resource")
	public void run(){
		try {
			try {
				//�����׽��ֵ����������
				InputStream inputStream = incomingSocket.getInputStream();
				OutputStream outputStream = incomingSocket.getOutputStream();
				//��������ת��Ϊɨ�����������ת��Ϊд����
				Scanner inScanner = new Scanner(inputStream);
				PrintWriter outPrintWriter =  new PrintWriter(outputStream, true);
				
				//����д������println������ͻ�������ַ���
				outPrintWriter.println("welcome!");
				
				//���ͻ��˴�������ݷ��ͻ�ȥ������ͻ������������Ϊbye����Ͽ�����
				boolean flag = false;
				while(!flag && inScanner.hasNext()){
					String backString = inScanner.next();
					outPrintWriter.println("you give me:" + backString);
					if(backString.trim().equals("bye")){
						flag = true;
					}
				}
			} finally {
				//�ر��׽��֣�����Ҫ����ֹ�����Դ�˷ѣ�
				incomingSocket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}

