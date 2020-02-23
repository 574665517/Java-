package string类型;

/**
 * @author ywx
 * @ date 2018年7月28日
 */
public class Changdu {

	/**输出字符串长度
	 * indexOF()是返回搜索的字符或字符串首次出现的位置
	 * lastIndexOf(String str)该方法返回指定字符串最后一次出现的索引位置
	 * 从字符串的开始位置检索参数字符串str并将最后一次出现str的索引位置返回
	 * @param args
	 */
	public static void main(String[] args) {
		//定义字符串str
		String str = "We are students";
		//将空字符串在str中的索引位置复赋值给size
		int size = str.lastIndexOf("");
		int size1 = str.indexOf("a");
		System.out.println("a在str中的索引位置" + size1);
		//将变量输出
		System.out.println("空字符在字符串str中的索引位置时：" + size);
		//将字符串str的长度输出
		System.out.println("字符串str的长度是：" + str.length());
	}

}
