package ʵѵ�����ܿ�����ҵa;

import java.io.*;
import java.net.*;

/**
 * @author ywx
 * @ date 2019��6��11��
 */
public class TCPClient {

	public static void main(String[] args) throws Exception {
		Socket client = null; // ����Socket����
		PrintStream out = null;//������ӡ������,�����������
		// ָ�����ӵ������Ͷ˿�
		client = new Socket("localhost", 8080);
		BufferedReader buf = null;//buf����,������Ϣ
		//ȡ�÷������˵�������
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str = buf.readLine(); // ��ȡ��Ϣ
		System.out.println("��������������ݣ�" + str);
		String str1 = "word";//Ҫ��ͻ����������Ϣ
		// ʵ������ӡ������,�����Ϣ
		out = new PrintStream(client.getOutputStream());
		out.println(str1); // �����Ϣ
		client.close(); // �ر�Socket
		buf.close(); // �ر�������
	}

}
