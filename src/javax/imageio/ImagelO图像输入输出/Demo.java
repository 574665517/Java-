package javax.imageio.ImagelO图像输入输出;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * @author ywx
 * @ date 2018年9月28日
 */
@SuppressWarnings("serial")
public class Demo extends JFrame {
	private BufferedImage bufferedImage;
	private int width;
	private int height;
	public Demo() throws IOException {
		setTitle("使用ImageIO的read方法");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		File file = new File("file:///E:/java/java类库/src/javax/imageio/ImagelO图像输入输出"
				+ "/mp45112782_1448757626493_29.png");//创建指定文件的File对象
			BufferedImage BufferedImage = ImageIO.read(file);//使用read方法读取图像
			width = BufferedImage.getWidth();//获得图像的宽度
			height = BufferedImage.getHeight();//获得图像的高度
		setBounds(420,280,width,height);//设置窗体的显示位置和大小
	}
	
	public void paint(Graphics g) {//重写paint方法
		g.drawImage(bufferedImage, 0, 0, width, height, this);//绘制图像
	}
	public static void main(String[] args) throws IOException {
		
	}

}
