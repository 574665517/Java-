package 封装类;

public class Ceshi1 {
	public static void main(String[] args) {
		Ceshi1 temp = new Ceshi1();
		int a = 500;
		//分别传递int类型和Integer类型
		temp.f(a);
		temp.f(Integer.valueOf(a));
	}
	public void f(long i) {
        System.out.println("基本类型参数的方法被调用");
    }
	public void f(Long i) {
        System.out.println("包装类型参数的方法被调用");
    }
}
