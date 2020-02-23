package 实训第三周课堂作业;

import java.awt.Graphics;

import javax.swing.*;


public class FiveChess extends JFrame {
	
	private static final long serialVersionUID = 8896350179955623074L;

    public FiveChess(){
		this.setSize(200, 200);
	  	this.setTitle("棋盘");
	  	this.setVisible(true);
	  	this.setLocationRelativeTo(null);	
	  	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	}

	public void paint(Graphics h) {//画线的方法重写
		super.paint(h);
		for (int i = 1; i <= 10; i++) {	
			h.drawLine(i * 20, 0, i * 20, 200);//Y
	       	h.drawLine(0, i * 20, 200, i * 20);
		}

	}	

	public static void main(String[] args) {
		new FiveChess();		
	}

}
