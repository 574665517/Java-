package 封装类;

public class Charac {

	public static void main(String[] args) {
		String str = Integer.toString(456);
		String str2 = Integer.toBinaryString(456);
		String str3 = Integer.toHexString(456);
		String str4 = Integer.toOctalString(456);
		System.out.println("456的十进制表示为：" + str);
		System.out.println("456的二进制表示为：" + str2);
		System.out.println("456的十六进制表示为：" + str3);
		System.out.println("456的八进制表示为：" + str4);
	}

}
