package ʵѵ�����ܿ�����ҵd;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * try-with-resources�������ã�
 * try-with-resources�����һ��������һ�ֻ������Դ��try��䡣��Դ��ָ�ڳ���������֮�����Ҫ�رյĶ���
 * try-with-resources��䱣֤��ÿ�������˵���Դ����������ʱ�򶼻ᱻ�رա�
 * @author ywx
 * @ date 2019��6��14��
 */
public class Test5 {
	public static void main(String[] args) throws Exception {
		String readTxt = new Test5().readFile("E:\\java\\java���\\src\\ʵѵ�����ܿ�����ҵd\\file1.txt");
		System.out.println(readTxt);
	}
	public String readFile(String path) throws Exception {//��Դ�ڴ���ִ�����Զ��ͷ�
		/**
		 * try-with-resources�������������BufferedReader��Դ��
		 * ��������������try�ؼ��ʵ�Բ�������档
		 * BufferedReader��Java SE7��ʼ��ʵ����java.lang.AutoCloseable�ӿڡ�
		 * ��ΪBufferedReader��������try-with-resources���棬
		 * ��������try������������������쳣����
		 * ���ȷ�˵BufferedReader.readLine�����׳�һ��IOException�쳣���������ᱻ�رա�
		 */
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			StringBuilder builder = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {//�ļ���ȡ
				builder.append(line);
				builder.append(String.format("%n"));
			}
			return builder.toString();
		}
	}
}
