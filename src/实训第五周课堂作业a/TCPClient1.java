package ʵѵ�����ܿ�����ҵa;

import java.io.*;
import java.net.*;

/**
 * @author ywx
 * @ date 2019��6��11��
 */
public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		Socket client = null; // ��ʾ�� ����
		client = new Socket("localhost", 8080);
		BufferedReader buf = null;
		PrintStream out = null;// ��������
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintStream(client.getOutputStream());
		boolean flag = true;// �����־λ
		while(flag){
			System.out.print("������Ϣ��");
			String str = input.readLine(); // ����������Ϣ
			out.println(str);
			if("bye".equals(str)){
				flag = false;
			} else {
				String echo = buf.readLine();//���ؽ��
				System.out.println(echo); // �����Ӧ��Ϣ
			}
		}
		buf.close();
		client.close();
	}
}
