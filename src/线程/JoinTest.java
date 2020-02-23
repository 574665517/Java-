package �߳�;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class JoinTest extends JFrame {
	private Thread threadA;
	private Thread threadB; // ���������߳�
	private Thread threadC;
	private Thread threadD;
	final JProgressBar progressBar = new JProgressBar(); // �����ĸ����������
	final JProgressBar progressBar2 = new JProgressBar();
	final JProgressBar progressBar3 = new JProgressBar();
	final JProgressBar progressBar4 = new JProgressBar();
	int count = 0;

	public static void main(String[] args) {
		init(new JoinTest(), 500, 500);
	}

	public JoinTest() {
		getContentPane().add(progressBar, BorderLayout.NORTH);// �������������ڴ������
		getContentPane().add(progressBar2, BorderLayout.EAST);
		getContentPane().add(progressBar3, BorderLayout.WEST);// �������������ڴ������ϲ�
		getContentPane().add(progressBar4, BorderLayout.SOUTH);

		progressBar.setStringPainted(true);// ���ý�������ʾ�����ַ�
		progressBar2.setStringPainted(true);
		progressBar3.setStringPainted(true);
		progressBar4.setStringPainted(true);
		threadA = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100);
						threadB.join(); // ʹ�߳�B����join()����
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
					progressBar2.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100);
						threadC.join(); // ʹ�߳�c����join����
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
					progressBar3.setValue(++count); // ���ý������ĵ�ǰֵ
					try {
						Thread.sleep(100);
						threadD.join(); // ʹ�߳�D����join����
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
					progressBar4.setValue(++count); // ���ý������ĵ�ǰֵ
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
