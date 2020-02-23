package 变量final;
class Aclass
{
	int a;
	//构造器
	public Aclass()
	{
		a = 100;
	}
	public void setA(int theA)
	{
		a = theA;
	}
	public int getA()
	{
		return a; 
	}
}

//定义一个类来测试
public class TestFinal {   //final静态全局变量只能显示初始化不能赋值
	final static int a1 = 10; //
	 //final实例全局变量只能显示初始化不能赋值
	final int a2 = 0;  
	 
	final Aclass REF_VAR = new Aclass();
	public static void main(String[] args) {   
		final int a4;//形参可以做final
	 //final局部变量（形参）若无初始化只能赋值一次
		  a4 = 5; //a4 = 7;只能赋值一次
		TestFinal tf = new TestFinal();
		 //tf.a2=7;
		 //a1=5;
		System.out.println(tf.REF_VAR.getA());//100
		tf.REF_VAR.setA(1);//1
		System.out.println(tf.REF_VAR.getA());
	}
}