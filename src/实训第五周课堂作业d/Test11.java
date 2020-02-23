package 实训第五周课堂作业d;

/**
 * 下面代码执行输出什么,为什么？
Hello B
Hello C
Hello I
 * @author ywx
 * @ date 2019年6月14日
 */
interface Inter { }
class A { }
	class B extends A implements Inter { }
	public class Test11 extends B {	
		public static void main(String[] args) {
			A a = new A();
			B b = new B();
			Test11 c = new Test11();
			/**
			 * java 中的instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例。
			 * 使用 instanceof 就是判断一个实例是否属于某种类型。
			 * instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。
			 */
			if (a instanceof B) {//a父类，a不是B的类型，错误不输出
				System.out.println("Hello A");
			}
			if (b instanceof A) {//子类是父类的类型
				System.out.println("Hello B");
			}
			if (c instanceof Test11) {//c是Test11的类型
				System.out.println("Hello C");
			}
			if (c instanceof Inter) {//c是接口的类型
				System.out.println("Hello I");
			}
		}
}
