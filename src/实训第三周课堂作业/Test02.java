package 实训第三周课堂作业;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ywx
 * @ date 2019年5月29日
 */
public class Test02 extends MouseAdapter {//鼠标适配器类
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("获取当前鼠标点击点坐标:" + e.getX() + e.getY());
	}

	public static void main(String[] args) {
		
	}

}
