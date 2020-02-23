package 深圳实训第一天;
public class TestEqual1
{
	public static void main(String[] args)
	{
		int a = 100;
		int b = 100;
		
		System.out.println("a==b? "+(a==b));
		
		Integer c = new Integer(100);
		Integer d = new Integer(100);
		
		
		System.out.println("c = d? "+(c==d));
		
		//深层比较
		System.out.println("c equals d? "+(c.equals(d)));
		
	}	
}