package ʵѵ�����ܿ�����ҵa;

class Dog {//�������ִ�����ʲô,Ϊʲô��woof woof 
	public static void bark() {//��̬������д
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
		woofer.bark();//bark�Ǿ�̬����,��̬����ֻ������أ�����ֻ����ø���ľ�̬����
		nipper.bark();
	}
}
