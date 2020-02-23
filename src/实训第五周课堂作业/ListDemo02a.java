package 实训第五周课堂作业;

public class ListDemo02a {

	public static void main(String[] args) {
//		Random random = new Random();
		for(int i = 0; i < 1000; i ++) {
//			int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写还是小写
//			System.out.println((char)(choice + random.nextInt(26)));
			int c = 'a' + (int)(Math.random() * 26);   //'a'会自动转换为int以执行加法
	        System.out.println((char)c);   //为了打印字符，必须将c强制转为char
		}
		
	}

}
