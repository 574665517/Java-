package ʵѵ�����ܿ�����ҵ;

public class ListDemo02a {

	public static void main(String[] args) {
//		Random random = new Random();
		for(int i = 0; i < 1000; i ++) {
//			int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // ȡ�ô�д����Сд
//			System.out.println((char)(choice + random.nextInt(26)));
			int c = 'a' + (int)(Math.random() * 26);   //'a'���Զ�ת��Ϊint��ִ�мӷ�
	        System.out.println((char)c);   //Ϊ�˴�ӡ�ַ������뽫cǿ��תΪchar
		}
		
	}

}
