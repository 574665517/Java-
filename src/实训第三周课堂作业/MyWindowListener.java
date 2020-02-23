package 实训第三周课堂作业;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author ywx
 * @ date 2019年5月29日
 */
public class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("窗口被打开");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("窗口正在关闭");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("窗口已经关闭");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("窗口激活");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("窗口未激活");
	}
	
}
