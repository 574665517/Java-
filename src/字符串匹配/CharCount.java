package 字符串匹配;

/**
 * @author ywx
 * @ date 2019年5月10日
 */
public class CharCount {
 
	public static void main(String[] args) {
		// 只考虑全部小写
		String str1 = "abcasdfghjjklloiuyyttreeeccvbbnm";
		
		int[] count = new int[26]; //用来存储小写字母a-z出现的次数。
		
		
		for(int i = 0; i < str1.length(); i++) {
			
			char tmp = str1.charAt(i); //依次取出每个字母
			int index = tmp - 97; //利用ascII码表，最小结果是0.
			count[index] = count[index] + 1;
		}
		
		//循环打印每个字母出现次数
		for(int j = 0; j < count.length; j++){
			if(count[j] != 0)
				System.out.println("字母" + (char)(j + 97) + "出现次数：" + count[j]);
		}
	}
}
