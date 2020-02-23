package 实训第五周课堂作业a;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年6月11日
 */
public class TCPTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			int i = 1;
			ServerSocket serverSocket = new ServerSocket(8080);
			while(true) {
				//等待客户端通过端口8001请求的连接
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
				//建立套接字的输入输出流
				InputStream inputStream = incomingSocket.getInputStream();
				OutputStream outputStream = incomingSocket.getOutputStream();
				//将输入流转化为扫描器，输出流转化为写入器
				Scanner inScanner = new Scanner(inputStream);
				PrintWriter outPrintWriter =  new PrintWriter(outputStream, true);
				
				//运用写入器的println函数向客户端输出字符串
				outPrintWriter.println("welcome!");
				
				//将客户端传输的数据发送回去，如果客户端输入的数据为bye，则断开连接
				boolean flag = false;
				while(!flag && inScanner.hasNext()){
					String backString = inScanner.next();
					outPrintWriter.println("you give me:" + backString);
					if(backString.trim().equals("bye")){
						flag = true;
					}
				}
			} finally {
				//关闭套接字（很重要，防止造成资源浪费）
				incomingSocket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}

