/*
 * 用内部类实现ActionListener
 */
package 实训第三周课堂作业;

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
		this.setTitle("聊天室");
		this.setLayout(new BorderLayout());
		y1 = new JTextArea("");
		y2 = new JLabel("发送");
		y3 = new JTextField();
		y4 = new JButton("发送");
		y4.addActionListener(new ButtonListener(y1,y3)); //向按钮注册事件监听器对象
		y1.setEditable(false);
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout()); // 将jp布局设置成BorderLayout
		jp.add(y2, BorderLayout.WEST);
		jp.add(y3, BorderLayout.CENTER);
		jp.add(y4, BorderLayout.EAST);
		// 将JPanel放在容器南边
		this.add(jp, BorderLayout.SOUTH);
		// 将JTextField放在容器的中部
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
			case 1 : y1.append("屌丝：" + y2.getText() + "\n");break;
			case 2 : y1.append("女神：" + y2.getText() + "\n");break;	
			}
			//y1.append("屌丝：" + y2.getText() + "\n");
			y2.setText("");// 发送完成之后，清空文本框内容

		}
	}

	public static void main(String[] args) {
		new ChatRoom();
	}

}
