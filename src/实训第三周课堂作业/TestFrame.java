package 实训第三周课堂作业;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author ywx
 * @ date 2019年5月29日
 */
public class TestFrame extends JFrame {

	private static final long serialVersionUID = -4151851762837829899L;

	public TestFrame() {
		this.setSize(300, 300);
		this.setVisible(true);
		//设置窗口关闭程序既结束
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new MyWindowListener());//添加时间注册，(内的)添加时间对象
		
		JButton btn = new JButton("按钮");
		btn.addActionListener(new ActionListener() {//匿名内部类

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("点击按钮");
			}
		});
		//this.add(btn);
		this.addMouseListener(new Test02());
	}

	public static void main(String[] args) {
		new TestFrame();
	}

}
