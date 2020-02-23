package string����;

public class IndexOf {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ʹ��indexOf���ַ�����������
		String str1 = "abcdefghijklmnoppqrstabc";
		System.out.println(str1.indexOf("c"));
		System.out.println(str1.indexOf("f", 3));
		System.out.println(str1.indexOf("x"));
		// ��split��������ָ���Ķ����ַ�������ĳһ�ַ������зָ�
		String str2 = "100010011100111110111110111100111";
		String b[] = str2.split("11111");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		String line = "";
		long startTime = System.nanoTime();
		for (int i = 0; i < 30000; i++) {
			line += (char) i;
		}
		long endTime = System.nanoTime();

		StringBuilder str = new StringBuilder();
		startTime = System.nanoTime();
		for (int i = 0; i < 30000; i++) {
			str.append((char) i);
		}
		endTime = System.nanoTime();

	}

}
