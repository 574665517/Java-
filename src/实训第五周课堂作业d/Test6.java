package 实训第五周课堂作业d;

/**
 * 下面代码执行结果打印的是？ 空
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test6 {
	static final int END = Integer.MAX_VALUE;//END是整数最大值，做任何加法时候都会溢出
	static final int START = END - 100;
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = START; i <= END; i++) {
			count++;
		}
		System.out.println(count);
	}
}
