package ʵѵ�����ܿ�����ҵd;

import java.io.File;

/**
 * ����������Ŀ¼������
 * @author ywx
 * @ date 2019��6��14��
 */

public class Test4 {
	public static void main(String[] args) {
		String path = "E:\\java\\java���\\src\\ʵѵ�����ܿ�����ҵd\\file.txt";
		//Creates the directory named by this abstract pathname
		new File(path).mkdir();
		//Creates the directory named by this abstract 
		//pathname, including anynecessary but nonexistent parent directories. 
//		new File(path).mkdirs();
	}
}
