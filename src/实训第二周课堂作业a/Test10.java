package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test10 {
	/**
	 * 主函数调用son1的test方法，
	 * son1的test方法继承FatherA
	 * FatherA new了一个Other方法
	 * Other方法又new 回son1
	 * 陷入无限递归，导致堆栈错误
	 * @param args
	 */

	public static void main(String[] args) {
		Son1 s = new Son1();
		s.test();
	}
}

class FatherA {// 父类
    FatherA() {
        new Other();
    }
}

class Son1 extends FatherA {// 子类
    public void test() {
        System.out.println("Hi, show me test");
    }
}

class Other {// 相关类
    public Other() {
    	new Son1(); 
    }
}
