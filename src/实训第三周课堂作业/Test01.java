package 实训第三周课堂作业;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author ywx
 * @ date 2019年5月28日
 */
public class Test01 {

	public static void main(String[] args) {
		JFrame w = new JFrame();//创建窗口对象
		w.setSize(500, 400);//设置窗口大小
		//添加标题
		w.setTitle("窗口");
		//设置程序居中
		w.setLocationRelativeTo(null);
		//设置窗口关闭程序既结束
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口不能改变大小
		w.setResizable(false);
		//设置背景窗口颜色
		w.getContentPane().setBackground(Color.GREEN);
		w.setVisible(true);//设置窗口可见
		
		JLabel L = new JLabel(new ImageIcon ("file:///E:/java/编程实例/src/猜拳游戏版本3/图片素材/1.jpg"));
		w.add(L);//将其他组件都添加到窗体上面来
		
		Button b = new Button("我是一个按钮");
		w.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 弹出确认对话框
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		w.add(b);
	}

}
