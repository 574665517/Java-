package string����;
public class ImmutableString {
	public static void main(String[] args) {
		 String s1 = "Test";//�������ĳ�����     
         String s2 = "Test";     
         String s3 = new String("Test");//��������
		 String s4 = new String("Test");//��������
		
		System.out.println(s1==s2);//true
		System.out.println(s3==s4);//false
		
		String a = "abcdceadt.java";
		String s5=a.substring(1,9);//bcdceadt	 
		String s51=a.substring(1,9);
		System.out.println("s5==s51 "+(s5==s51));//false
		System.out.println(s5);
		String s6=a.substring(1);//bcdceadt.java	 
		System.out.println(s6);
		//�ӵڶ����ַ���"a"�״γ��ֵ�λ��
		int n1=a.indexOf("a",2);//6
		 System.out.println(n1);
		 //������λ��2����ʼ��������
		 int n=a.lastIndexOf("a",2);//0
		System.out.println(n);
		//���Դ��ַ����Ƿ���ָ���ĺ�׺����
		System.out.println(a.endsWith(".java"));       
	    String s7="11:23:15";
		//�á������ָ��ַ���
		String[] ret=s7.split(":");
		for(int i=0;i<ret.length;i++)
		{System.out.print(ret[i]+" ");}
	}
}