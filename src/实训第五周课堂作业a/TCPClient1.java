package 实训第五周课堂作业a;

import java.io.*;
import java.net.*;

/**
 * @author ywx
 * @ date 2019年6月11日
 */
public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		Socket client = null; // 表示客 户端
		client = new Socket("localhost", 8080);
		BufferedReader buf = null;
		PrintStream out = null;// 发送数据
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintStream(client.getOutputStream());
		boolean flag = true;// 定义标志位
		while(flag){
			System.out.print("输入信息：");
			String str = input.readLine(); // 接收输入信息
			out.println(str);
			if("bye".equals(str)){
				flag = false;
			} else {
				String echo = buf.readLine();//返回结果
				System.out.println(echo); // 输出回应信息
			}
		}
		buf.close();
		client.close();
	}
}
