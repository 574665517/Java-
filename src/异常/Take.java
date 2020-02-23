package 异常;

public class Take {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try { // try语句中包含可能出现异常的程序代码
			String str = "lili";
			System.out.println(str + "年龄是");
			int age = Integer.parseInt("20"); // 数据类型转换		
		} catch (Exception e) { // catch 语句块用来获取异常信息
//			e.getMessage();//输出异常错误性质
//			e.toString();//给出异常的类型和性质
			e.printStackTrace(); // 输出异常类型，性质，栈层次机在程序中的位置
		}
		System.out.println("program over");
	}
}
