package ʵѵ�����ܿ�����ҵ;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author ywx
 * @ date 2019��5��29��
 */
public class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("���ڱ���");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�������ڹر�");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("�����Ѿ��ر�");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("���ڼ���");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("����δ����");
	}
	
}
