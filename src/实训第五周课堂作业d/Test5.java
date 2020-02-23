package 实训第五周课堂作业d;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * try-with-resources语句的作用？
 * try-with-resources语句是一种声明了一种或多种资源的try语句。资源是指在程序用完了之后必须要关闭的对象。
 * try-with-resources语句保证了每个声明了的资源在语句结束的时候都会被关闭。
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test5 {
	public static void main(String[] args) throws Exception {
		String readTxt = new Test5().readFile("E:\\java\\java类库\\src\\实训第五周课堂作业d\\file1.txt");
		System.out.println(readTxt);
	}
	public String readFile(String path) throws Exception {//资源在代码执行完自动释放
		/**
		 * try-with-resources语句种声明的是BufferedReader资源。
		 * 声明语句紧跟着在try关键词的圆括号里面。
		 * BufferedReader从Java SE7开始就实现了java.lang.AutoCloseable接口。
		 * 因为BufferedReader声明在了try-with-resources里面，
		 * 所以无论try语句是正常结束还是异常结束
		 * （比方说BufferedReader.readLine方法抛出一个IOException异常），它都会被关闭。
		 */
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {//文件读取
				builder.append(line);
				builder.append(String.format("%n"));
			}
			return builder.toString();
		}
	}
}
