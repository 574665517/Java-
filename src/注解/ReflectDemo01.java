package 注解;

/**
 * 运行结果：@java.lang.Deprecated()
SimpleBeanOne 的toString()方法使用了3个Annotation,但是只有Deprecated使用
了RUNTIME的方式声明,所以只有它可以取得。
@author ywx
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectDemo01 {
	public static void main(String args[]) throws Exception {//异常抛出
		Class<?> c = null ; // 取得Class实例
		c = Class.forName("注解.SimpleBeanOne");
		Method toM = c.getMethod("toString"); //取得toString()方法
		Annotation an[] = toM.getAnnotations(); //取得全部的Annotation
		for (Annotation a : an) { // foreach输出
		System.out.println(a); // 直接输出信息
	}
		}
}
