package 实训第五周课堂作业a;

import java.io.*;
import java.net.*;

/**
 * 建立服务器程序
 * @author ywx
 * @ date 2019年6月11日
 */
public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = null;//声明ServerSocket对象
		Socket client = null;//一个Socket对象表示一个客户端
		PrintStream out = null;//声明打印流对象,以向客户端输出
		//服务器在8888端口上等待客户端访问
		server = new ServerSocket(8080);
		System.out.println("服务器运行,等待客户端连接");
		client = server.accept(); // 程序再此阻塞,等待客户端连接
		String str = "hello";//要向客户端输出的信息
		// 实例化打印流对象,输出信息
		out = new PrintStream(client.getOutputStream());
		out.println(str); // 输出信息
		BufferedReader buf1 = null;//buf对象,接收信息
		//取得客户端的输入流
		buf1 = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str2 = buf1.readLine(); // 读取信息
		System.out.println("客户端输出内容：" + str2);
		out.close(); // 关闭打印流
		client.close(); // 关闭客户端连接
		server.close(); // 关闭服务器连接
	}
}
