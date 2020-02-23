package string类型;
public class ImmutableString {
	public static void main(String[] args) {
		 String s1 = "Test";//方法区的常量池     
         String s2 = "Test";     
         String s3 = new String("Test");//堆区创建
		 String s4 = new String("Test");//堆区创建
		
		System.out.println(s1==s2);//true
		System.out.println(s3==s4);//false
		
		String a = "abcdceadt.java";
		String s5=a.substring(1,9);//bcdceadt	 
		String s51=a.substring(1,9);
		System.out.println("s5==s51 "+(s5==s51));//false
		System.out.println(s5);
		String s6=a.substring(1);//bcdceadt.java	 
		System.out.println(s6);
		//从第二个字符起"a"首次出现的位置
		int n1=a.indexOf("a",2);//6
		 System.out.println(n1);
		 //从索引位置2处开始反向搜索
		 int n=a.lastIndexOf("a",2);//0
		System.out.println(n);
		//测试此字符串是否以指定的后缀结束
		System.out.println(a.endsWith(".java"));       
	    String s7="11:23:15";
		//用“：”分割字符串
		String[] ret=s7.split(":");
		for(int i=0;i<ret.length;i++)
		{System.out.print(ret[i]+" ");}
	}
}