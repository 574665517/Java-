package 实训第二周课堂作业a;

import java.util.Random;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test2 {
	//常量不会变，然后这个常量会变，就是变量了
	//常量是第一次赋值后之后不会变化
	public static void main(String[] args) {
		System.out.println("常量值：" + Const.RAND_CONST);
	}

	/* 接口常量 */
	interface Const {
	//常量？
	public static final int RAND_CONST = new Random().nextInt();
	}
	
}
