package 实训第五周课堂作业d;

/**
 * 突然有一天，父亲心血来潮想让大儿子去认个干爹，也
就是大儿子的父亲名称需要重新设置一下，
大儿子的父亲是干爹
小儿子的父亲是干爹
 * @author ywx
 * @ date 2019年6月14日
 */
public class Person1 {
	/**
	 * 怎么回事，小儿子的父亲也成了“干爹”? 两个儿子都没有了，岂不是要气死“小头爸爸”了！
	 * 浅克隆不能克隆对象的内容，必须深克隆
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 因为拷贝时super.clone()方法调用的是Object的方法，就是这个方法的原因，它是一种浅拷贝的方式。
		 * 所以也就是说，小儿子的对象是通过拷贝大儿子产生的，父亲是同一个，也就是同一个对象。
		 * 于是修改了大儿子的父亲值，小儿子也跟着修改了。同理改小儿子的父亲也是一样，大儿子也会跟着修改。
		 */
		Person f = new Person("小头爸爸");// 定义父亲
		Person s1 = new Person("大儿子", f);// 定义大儿子
		System.out.println(s1.getFather());
		// 小儿子的信息是通过大儿子拷贝过来的
		Person s2 = s1.clone();
		System.out.println(s2.getFather());
		s2.setName("小儿子");
		//认干爹
		s1.getFather().setName("干爹");
		System.out.println(s1.getName() + "的父亲是" + s1.getFather().getName());
		System.out.println(s2.getName() + "的父亲是" + s2.getFather().getName());
	}

}
