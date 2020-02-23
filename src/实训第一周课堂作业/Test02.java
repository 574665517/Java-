package 实训第一周课堂作业;

public class Test02 {

	//计算一天的微妙数除以毫秒数
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);//显然得不出正确答案
		//不能，赋值的数默认是int型，要在末尾加上1使之变成long型才能得出正确答案
	}

}
