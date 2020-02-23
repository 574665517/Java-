package 实训第六周课堂作业;

interface IFunction3<T> {//只接受一个参数
	public int compare(T t1, T t2);
}
public class MethodRefDemo3 {
	public static void main(String[] args) {
		IFunction3<String> fun = String::compareTo;
		//方法引用前不需要定义对象,而是将对象定义在了方法上
		System.out.println(fun.compare("A", "C"));
	}
}
