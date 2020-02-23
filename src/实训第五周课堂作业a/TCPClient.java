package 实训第五周课堂作业a;

import java.io.*;
import java.net.*;

/**
 * @author ywx
 * @ date 2019年6月11日
 */
public class TCPClient {

	public static void main(String[] args) throws Exception {
		Socket client = null; // 声明Socket对象
		PrintStream out = null;//声明打印流对象,以向服务端输出
		// 指定连接的主机和端口
		client = new Socket("localhost", 8080);
		BufferedReader buf = null;//buf对象,接收信息
		//取得服务器端的输入流
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str = buf.readLine(); // 读取信息
		System.out.println("服务器端输出内容：" + str);
		String str1 = "word";//要向客户端输出的信息
		// 实例化打印流对象,输出信息
		out = new PrintStream(client.getOutputStream());
		out.println(str1); // 输出信息
		client.close(); // 关闭Socket
		buf.close(); // 关闭输入流
	}

}
