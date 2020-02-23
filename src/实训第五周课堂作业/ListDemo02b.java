package 实训第五周课堂作业;

import java.util.Random;

public class ListDemo02b {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		char[] c = s.toCharArray();
		Random random = new Random();
		for(int i = 0; i < 1000; i++) {
			System.out.println(c[random.nextInt(c.length)]);
		}
	}

}
