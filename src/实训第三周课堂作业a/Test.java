package 实训第三周课堂作业a;

class Dog {//下面代码执行输出什么,为什么？woof woof 
	public static void bark() {//静态方法重写
		System.out.print("woof ");
	}
}
class Basenji extends Dog {
	public static void bark(){}
}

public class Test {
	public static void main(String[] args) {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();//bark是静态方法,静态方法只和类相关，所以只会调用父类的静态方法
		nipper.bark();
	}
}
