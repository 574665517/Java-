package 实训第六周课堂作业;

/**
 * 
 * @author ywx
 * @ date 2019年6月17日
 */

interface IFunction2<R> {
	public R upper();
}

public class MethodRefDemo2 {
	public static void main(String[] args) {
		//“hello”字符串是String类的实例对象
		//将toUpperCase()函数式的引用交个了IFunction接口
		IFunction2<String> fun = "hello"::toUpperCase;//对象::方法
		String str = fun.upper();//此次相当于
		"hello".toUpperCase();
		System.out.println(str);
	}
}
