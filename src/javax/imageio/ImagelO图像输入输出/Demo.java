package javax.imageio.ImagelOͼ���������;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * @author ywx
 * @ date 2018��9��28��
 */
@SuppressWarnings("serial")
public class Demo extends JFrame {
	private BufferedImage bufferedImage;
	private int width;
	private int height;
	public Demo() throws IOException {
		setTitle("ʹ��ImageIO��read����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		File file = new File("file:///E:/java/java���/src/javax/imageio/ImagelOͼ���������"
				+ "/mp45112782_1448757626493_29.png");//����ָ���ļ���File����
			BufferedImage BufferedImage = ImageIO.read(file);//ʹ��read������ȡͼ��
			width = BufferedImage.getWidth();//���ͼ��Ŀ��
			height = BufferedImage.getHeight();//���ͼ��ĸ߶�
		setBounds(420,280,width,height);//���ô������ʾλ�úʹ�С
	}
	
	public void paint(Graphics g) {//��дpaint����
		g.drawImage(bufferedImage, 0, 0, width, height, this);//����ͼ��
	}
	public static void main(String[] args) throws IOException {
		
	}

}
