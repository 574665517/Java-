package 实训第五周课堂作业d;

/**
 * 你能不通过IDE执行写成出打印的信息吗？ABDCBDCB
 * @author ywx
 * @ date 2019年6月14日
 */
public class Test13 {
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); foo('B') && (i < 2); foo('C')) {
			i++;
			foo('D');
		}
	}
}
