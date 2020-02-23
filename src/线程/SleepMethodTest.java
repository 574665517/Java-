package �߳�;

import java.awt.*;
import java.util.*;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SleepMethodTest extends JFrame {
	private Thread t;
	// ������ɫ����
	private static Color[] color = { Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW,
			Color.RED, Color.PINK, Color.LIGHT_GRAY };
	private static final Random rand = new Random(); // �����������

	private static Color getC() { // ��ȡ�����ɫֵ�ķ���
		return color[rand.nextInt(color.length)];
	}

	public SleepMethodTest() {
		t = new Thread(new Runnable() { // ���������̶߳���
			int x = 30; // �����ʼ����
			int y = 50;

			public void run() {
				while (true) { // ����ѭ��
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// ��ȡ�����ͼ�����Ķ���
					Graphics graphics = getGraphics();
					graphics.setColor(getC());// ���û�ͼ��ɫ
					// ����ֱ�߲�������ֱ����
					graphics.drawLine(x, y, 100, y++);
					if (y >= 80) {
						y = 50;
					}
				}
			}

		});
		t.start();
	}

	public static void main(String[] args) {
		init(new SleepMethodTest());

	}

	// ��ʼ���������ķ���
	public static void init(JFrame frame) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		frame.setVisible(true);
	}
}
