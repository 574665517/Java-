package math类型;

import java.util.Scanner;

public class GenHao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数");
		double  n = s.nextDouble();
		System.out.println(n + "平方根值:" + Math.sqrt(n));	
	}

}
