package 实训第六周课堂作业;

/**
 * 实现方法的引用接口
* @param <T> 引用方法的参数类型
* @param <R> 引用方法的返回值类型
 * @author ywx
 * @ date 2019年6月17日
 */
@FunctionalInterface //函数式接口，一个接口只能有一个方法
interface IFunction<T,R> {//函数式接口，T参数类型，R返回类型
	public R apply(T t);
}

public class MethodRefDemo1 {
	public static void main(String[] args) {
		//前面是参数类型，后面是返回值类型
		IFunction<Integer, String> fun = String::valueOf;//类名::方法
		String str = fun.apply(10030);
		System.out.println(str.replaceAll("0", "6"));//0替换成6
	}
}
