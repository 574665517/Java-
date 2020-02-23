package 实训第五周课堂作业a;

import java.io.*;
import java.net.*;

public class URLDemo {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.jxau.edu.cn");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
