package ʵѵ�����ܿ�����ҵa;

import java.io.*;
import java.net.*;

/**
 * ��������������
 * @author ywx
 * @ date 2019��6��11��
 */
public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = null;//����ServerSocket����
		Socket client = null;//һ��Socket�����ʾһ���ͻ���
		PrintStream out = null;//������ӡ������,����ͻ������
		//��������8888�˿��ϵȴ��ͻ��˷���
		server = new ServerSocket(8080);
		System.out.println("����������,�ȴ��ͻ�������");
		client = server.accept(); // �����ٴ�����,�ȴ��ͻ�������
		String str = "hello";//Ҫ��ͻ����������Ϣ
		// ʵ������ӡ������,�����Ϣ
		out = new PrintStream(client.getOutputStream());
		out.println(str); // �����Ϣ
		BufferedReader buf1 = null;//buf����,������Ϣ
		//ȡ�ÿͻ��˵�������
		buf1 = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str2 = buf1.readLine(); // ��ȡ��Ϣ
		System.out.println("�ͻ���������ݣ�" + str2);
		out.close(); // �رմ�ӡ��
		client.close(); // �رտͻ�������
		server.close(); // �رշ���������
	}
}
