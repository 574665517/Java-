package ʵѵ�����ܿ�����ҵa;

import java.io.*;
import java.net.*;

/**
 * @author ywx
 * @ date 2019��6��11��
 */

public class ThreadServer extends Thread {
	private Socket client = null;
	
	public void setSocket(Socket client) { 
		this.client= client;
	}
	public void run() {
		try {
		PrintStream out = new PrintStream(client.getOutputStream());
		//�ͻ��������
		BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		boolean temp = true;
		while (temp) { // Ҫһֱ���տͻ��˵�����
			String str = buf.readLine(); // ��������
			if ("bye".equals(str)) {
				temp = false; // ���ٽ���
			} else {// �߳�����
				str = str.replace("��", " ").replace(" ��", "!").replace(" ��", "!");
				out.println("Server>>��" + str); // �������ͻؿͻ���
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
