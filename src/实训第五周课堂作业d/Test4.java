package 实训第五周课堂作业d;

import java.io.File;

/**
 * 这两个创建目录的区别？
 * @author ywx
 * @ date 2019年6月14日
 */

public class Test4 {
	public static void main(String[] args) {
		String path = "E:\\java\\java类库\\src\\实训第五周课堂作业d\\file.txt";
		//Creates the directory named by this abstract pathname
		new File(path).mkdir();
		//Creates the directory named by this abstract 
		//pathname, including anynecessary but nonexistent parent directories. 
//		new File(path).mkdirs();
	}
}
