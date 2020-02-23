package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
class Base {//父类，父类的方法可以转给子类
     void fun(int price, int... discounts) {//...是可变参数,传一个参数也对，传两个参数也对，传n个参数也对，可以把动态整数转化成数组
         System.out.println("Base……fun");
     }
}

class Sub extends Base {// 子类,能重用父类的方法
     void fun(int price, int[] discounts) {//数组对象
         System.out.println("Sub……fun");
     }
}

public class Test5 {
	/**
	 * 形参列表是由父类决定的，由于是变长参数，在编译时，
	 * base.fun(100,50)中 50 会被编译器猜测而编译为{50} 数组，再由子类Sub执行。
	 * 子类直接调用时，编译器不会吧50 做类型转换，因为数组本身也是一个对象，
	 * 编译器不会爱两个没有继承关系之间的类做转换，类型不匹配自然拒绝执行，给与错误。
	 * @param args
	 */
	
	//第一个方法向上转型，形参由父类决定，第二个方法子类直接调用时参数列表不匹配也不会到父类中找，所以出错。
	public static void main(String[] args) {
		Base base = new Sub();// 向上转型
		base.fun(100, 50);//子类又重写了，把50转成数组可以交给子类处理
		Sub sub = new Sub();// 不转型
		//sub.fun(100, 50);//第二个要传一个整数数组，数组是一个引用类型，你传整数进去不能转成数组类型
		sub.fun(100, new int[] {50});
	}

}
