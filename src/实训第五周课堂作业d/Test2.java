package 实训第五周课堂作业d;

/**
 * 下面的程序输出什么? 0020
 * @author ywx
 * @ date 2019年6月14日
 */
class ValHold { 
	public int i = 0; 
}
public class Test2 {
	/**
	 * 这是因为引用的关系.在another方法里这个赋值很关键 v=vh; 
但是此处的v并非main方法里的v,之前他们引用的是同一个对象,但vh引用的对象赋给v后
,并不代表把main方法里的v所引用的对象改变.所以main方法里的v状态停留在20的时候.
java的函数是传值的,传进去的对象后,引用是不能改变的,但所引用对象状态是可以改变的.
	 * @param args
	 */
	public static void main(String[] args) {//仍然是值传递的问题
		Test2 o = new Test2();
		o.amethod();
	}
	public void amethod() {
		int i = 99;
		ValHold v = new ValHold();
		v.i = 30;
//		System.out.println("v:" + v);
		another(v, i);//值传递，传得是地址值
//		System.out.println("v:" + v);
		System.out.print(v.i);//由于被another改了20
	}
	public void another(ValHold v, int i) {//v和i = 99进来
		/**
		 * another函数中的v首先指向主函数中的V，然后v.i被改为20，
		 * 最后another函数中的v又指向vh，此时主函数中的v.i已经被改为了20
		 */
		i = 0;
		v.i = 20;
		ValHold vh = new ValHold();//new的成员变量是空的
//		System.out.println("vh:" + vh);
		v = vh;//vh地址传递给v
//		System.out.println("v:" + v);
		System.out.print(v.i);//0
		System.out.print(i);//0
	}
}
