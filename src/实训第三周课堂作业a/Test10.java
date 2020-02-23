package 实训第三周课堂作业a;

public class Test10 {//猜猜输出什么？value is Hello
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
//		if((s.length( ) > 5) && 
//				(s.append("there").equals("False")));//短路与，表达式一错误直接不运算表达式二
		if((s.append("there").equals("False")) && (s.length( ) > 5));//value is Hellothere
		System.out.println("value is " + s);
	}
}
