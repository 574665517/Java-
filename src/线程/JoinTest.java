package 线程;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class JoinTest extends JFrame {
	private Thread threadA;
	private Thread threadB; // 定义两个线程
	private Thread threadC;
	private Thread threadD;
	final JProgressBar progressBar = new JProgressBar(); // 定义四个进度条组件
	final JProgressBar progressBar2 = new JProgressBar();
	final JProgressBar progressBar3 = new JProgressBar();
	final JProgressBar progressBar4 = new JProgressBar();
	int count = 0;

	public static void main(String[] args) {
		init(new JoinTest(), 500, 500);
	}

	public JoinTest() {
		getContentPane().add(progressBar, BorderLayout.NORTH);// 将进度条设置在窗口最北部
		getContentPane().add(progressBar2, BorderLayout.EAST);
		getContentPane().add(progressBar3, BorderLayout.WEST);// 将进度条设置在窗口最南部
		getContentPane().add(progressBar4, BorderLayout.SOUTH);

		progressBar.setStringPainted(true);// 设置进度条显示数字字符
		progressBar2.setStringPainted(true);
		progressBar3.setStringPainted(true);
		progressBar4.setStringPainted(true);
		threadA = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100);
						threadB.join(); // 使线程B调用join()方法
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		threadA.start();
		threadB = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar2.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100);
						threadC.join(); // 使线程c调用join方法
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100)
						break;
				}

			}

		});
		threadB.start();
		threadC = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar3.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100);
						threadD.join(); // 使线程D调用join方法
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100)
						break;
				}

			}

		});
		threadC.start();
		threadD = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar4.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (count == 100)
						break;
				}

			}

		});
		threadD.start();
	}

	public static void init(JFrame frame, int width, int height) {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);

	}

}
