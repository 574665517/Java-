package string����;

import java.util.Scanner;

public class Index {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("�������ַ�����");
		String string = new Scanner(System.in).next();
		StringBuffer s1 = new StringBuffer(string);
		int index;
		for (index = 0; index < s1.length(); index++) {
			if (index % 6 == 0) {
				s1.insert(index, '\0');
			}
		}
		// if (string.indexOf(string2) == -1) {
		// continue;
		// }

		System.out.println(string + "ÿ�����1�ͼ���һ��0:");
		System.out.println(s1.toString());
	}

}
