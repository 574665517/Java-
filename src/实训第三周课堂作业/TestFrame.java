package ʵѵ�����ܿ�����ҵ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author ywx
 * @ date 2019��5��29��
 */
public class TestFrame extends JFrame {

	private static final long serialVersionUID = -4151851762837829899L;

	public TestFrame() {
		this.setSize(300, 300);
		this.setVisible(true);
		//���ô��ڹرճ���Ƚ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new MyWindowListener());//���ʱ��ע�ᣬ(�ڵ�)���ʱ�����
		
		JButton btn = new JButton("��ť");
		btn.addActionListener(new ActionListener() {//�����ڲ���

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����ť");
			}
		});
		//this.add(btn);
		this.addMouseListener(new Test02());
	}

	public static void main(String[] args) {
		new TestFrame();
	}

}
