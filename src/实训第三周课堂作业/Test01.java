package ʵѵ�����ܿ�����ҵ;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author ywx
 * @ date 2019��5��28��
 */
public class Test01 {

	public static void main(String[] args) {
		JFrame w = new JFrame();//�������ڶ���
		w.setSize(500, 400);//���ô��ڴ�С
		//��ӱ���
		w.setTitle("����");
		//���ó������
		w.setLocationRelativeTo(null);
		//���ô��ڹرճ���Ƚ���
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڲ��ܸı��С
		w.setResizable(false);
		//���ñ���������ɫ
		w.getContentPane().setBackground(Color.GREEN);
		w.setVisible(true);//���ô��ڿɼ�
		
		JLabel L = new JLabel(new ImageIcon ("file:///E:/java/���ʵ��/src/��ȭ��Ϸ�汾3/ͼƬ�ز�/1.jpg"));
		w.add(L);//�������������ӵ�����������
		
		Button b = new Button("����һ����ť");
		w.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����ȷ�϶Ի���
				JOptionPane.showMessageDialog(null, "�����Ի���");
			}
		});
		w.add(b);
	}

}
