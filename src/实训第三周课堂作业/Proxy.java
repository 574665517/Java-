package ʵѵ�����ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��31��
 */
public class Proxy {

	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer();
			String str = new String();
			// ƴ��10000���ַ�

			int maxCount = 100000;
			long begin = System.currentTimeMillis();
			for (int i = 0; i < maxCount; i++) {
				sb.append('a');
			}
			long end = System.currentTimeMillis();
			System.out.println("StringBuffer������Ҫ��ʱ��:" + (end - begin));

			begin = System.currentTimeMillis();
			for (int i = 0; i < maxCount; i++) {
				str += 'a';
			}
			end = System.currentTimeMillis();
			System.out.println("String������Ҫ��ʱ��:" + (end - begin));
		}

}
