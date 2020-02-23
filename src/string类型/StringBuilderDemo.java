/**
 *  @author ywx
 *  @ date 2018年8月13日
 */
package string类型;

/**
 * @author ywx
 * @ date 2018年8月13日
 */
public class StringBuilderDemo {

	/**
	 * 字符串生成器
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "";//创建空字符串
		//定义对字符串执行操作的起始时间
		long starTime = System.currentTimeMillis();
		for(int i = 0;i < 10000;i++) {//利用for循环执行10000次操作
			str = str + i;//循环追加字符串
		}
		long endTime = System.currentTimeMillis();//定义字符串操作后的时间
		long time = endTime - starTime;//计算对字符串执行操作的时间
		System.out.println("String消耗的时间："+ time);
		StringBuilder buider = new StringBuilder("");//创建字符串生成器
		starTime = System.currentTimeMillis();//定义字符串操作前时间
		for(int j = 0; j < 10000; j++) {
			buider.append(j);
		}
		endTime = System.currentTimeMillis();//定义操作后的时间
		time = endTime - starTime;
		System.out.println("StringBuider消耗的时间："+ time);
	}

}
