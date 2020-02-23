package 异常;

public class TryCatchDemo {

	public static void main(String[] args) {
		int a, b, c;
		try {
			a = 100;
			b = Integer.parseInt(args[0]);
			c = a/b;
			System.out.println("c= "  + c);
			System.out.println("没有异常!");
		}
		catch(ArithmeticException e) { //处理算数运算异常
			System.out.println("捕获异常：" + e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) { //异常处理
			System.out.println("没有异常处理类:" + e.getMessage());
			e.printStackTrace();
		}
		finally {//不管是否有异常产生，通常用于处理善后清理工作
			System.out.println("执行完毕!");
		}

	}

}
