package ����ʵѵ��һ��;
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
		
		//���Ƚ�
		System.out.println("c equals d? "+(c.equals(d)));
		
	}	
}