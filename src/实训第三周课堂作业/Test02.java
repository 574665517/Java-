package ʵѵ�����ܿ�����ҵ;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ywx
 * @ date 2019��5��29��
 */
public class Test02 extends MouseAdapter {//�����������
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("��ȡ��ǰ�����������:" + e.getX() + e.getY());
	}

	public static void main(String[] args) {
		
	}

}
