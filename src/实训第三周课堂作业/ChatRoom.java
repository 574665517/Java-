/*
 * ���ڲ���ʵ��ActionListener
 */
package ʵѵ�����ܿ�����ҵ;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ChatRoom extends JFrame {
	private JTextArea y1;
	private JLabel y2;
	private JTextField y3;
	private JButton y4;

	public ChatRoom() {
		this.setSize(600, 400);
		this.setTitle("������");
		this.setLayout(new BorderLayout());
		y1 = new JTextArea("");
		y2 = new JLabel("����");
		y3 = new JTextField();
		y4 = new JButton("����");
		y4.addActionListener(new ButtonListener(y1,y3)); //��ťע���¼�����������
		y1.setEditable(false);
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout()); // ��jp�������ó�BorderLayout
		jp.add(y2, BorderLayout.WEST);
		jp.add(y3, BorderLayout.CENTER);
		jp.add(y4, BorderLayout.EAST);
		// ��JPanel���������ϱ�
		this.add(jp, BorderLayout.SOUTH);
		// ��JTextField�����������в�
		this.add(y1, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	class ButtonListener implements ActionListener {
		JTextArea y1;
		JTextField y2;

		public ButtonListener(JTextArea y1, JTextField y2) {
			this.y1 = y1;
			this.y2 = y2;
		}

		public void actionPerformed(ActionEvent e) {
			int result = 0;
			int type = (int) (Math.random() * 10);
			if(type > 5) {
				type = 2;
			} else {
				type = 1;
			}
			switch(type) {
			case 1 : y1.append("��˿��" + y2.getText() + "\n");break;
			case 2 : y1.append("Ů��" + y2.getText() + "\n");break;	
			}
			//y1.append("��˿��" + y2.getText() + "\n");
			y2.setText("");// �������֮������ı�������

		}
	}

	public static void main(String[] args) {
		new ChatRoom();
	}

}
