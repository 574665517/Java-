package test.resources;

/**
 * @author ywx
 * @ date 2019年4月1日
 */
public class Calculator {
	private static int result;//静态变量，用于存储运行结果
	
	public void add(int n) {
		result = result + n;
	}
	public void substract(int n) {
		result = result - 1;//Bug：正确地应该是result = result - n
	}
	public void multiply(int n) {
		//此方法尚未写好
	}
	public void divide(int n) {
		result = result / n;
	}
	public void square(int n) {
		result = n * n;
	}
	public void squareRoot(int n) {
		for(;;);//Bug死循环
	}
	public void clear() {
		result = 0;
	}
	public int getResult() {
		return result;
	}
}
