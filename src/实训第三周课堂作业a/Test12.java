package 实训第三周课堂作业a;

public class Test12 {//分析下面代码,写出结果，说明缘由？1234
//	public static void changeStr(String str){//静态方法只能用类名.方法名调用
//		str = "welcome";
//	}
	
	public static String changeStr(String str){//静态方法只能用类名.方法名调用
		str = "welcome";
		System.out.println(str);
		return str;
	}
	public static void main(String[] args) {//字符串是不可变的字符串序列，str在内存中堆1234
		//确实做的是值传递，改成"welcome"，改了字符串序列，并没有改出来
		String str = "1234";
		changeStr(str);//这是动态调用
		System.out.println(str);
	}
}
