package ʵѵ�����ܿ�����ҵa;

import java.net.*;

/**
 * @author ywx
 * @ date 2019��6��11��
 */
public class TCPServer1 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = null; // ����ServerSocket����
		//��������8888�˿��ϵȴ��ͻ��˷���
		server = new ServerSocket(8080);
		System.out.println("����������,�ȴ��ͻ�������");
		boolean flag = true;
		while (flag) { // ���������Խ��յ�����û�����
			// �����ٴ�����,�ȴ��ͻ�������
			Socket client = server.accept();
			ThreadServer ts = new ThreadServer(); // �߳�����
			ts.setSocket(client);// ����socket
			ts.start(); // �����߳�
		}
		server.close(); // �رշ���������
	}

}
