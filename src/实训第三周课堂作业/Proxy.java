package 实训第三周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class Proxy {

	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer();
			String str = new String();
			// 拼接10000个字符

			int maxCount = 100000;
			long begin = System.currentTimeMillis();
			for (int i = 0; i < maxCount; i++) {
				sb.append('a');
			}
			long end = System.currentTimeMillis();
			System.out.println("StringBuffer运算需要的时间:" + (end - begin));

			begin = System.currentTimeMillis();
			for (int i = 0; i < maxCount; i++) {
				str += 'a';
			}
			end = System.currentTimeMillis();
			System.out.println("String运算需要的时间:" + (end - begin));
		}

}
