package 实训第五周课堂作业a;

import java.io.*;
import java.net.*;

/**
 * @author ywx
 * @ date 2019年6月11日
 */

public class ThreadServer extends Thread {
	private Socket client = null;
	
	public void setSocket(Socket client) { 
		this.client= client;
	}
	public void run() {
		try {
		PrintStream out = new PrintStream(client.getOutputStream());
		//客户端输出流
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		boolean temp = true;
		while (temp) { // 要一直接收客户端的请求
			String str = buf.readLine(); // 接收内容
			if ("bye".equals(str)) {
				temp = false; // 不再接收
			} else {// 线程子类
				str = str.replace("吗", " ").replace(" ？", "!").replace(" ？", "!");
				out.println("Server>>：" + str); // 将内容送回客户端
			}
		}
			out.close();
			buf.close();
			client.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
