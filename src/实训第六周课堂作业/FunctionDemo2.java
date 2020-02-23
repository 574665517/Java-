package 实训第六周课堂作业;

import java.util.function.Consumer;

class MyDemo {
	public void print(String str) {
		System.out.println(str);
	}
}
public class FunctionDemo2 {
	public static void main(String[] args) {
		Consumer<String> cons = new MyDemo()::print;
		cons.accept("Hello World!");
	}
}
