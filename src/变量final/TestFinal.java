package ����final;
class Aclass
{
	int a;
	//������
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

//����һ����������
public class TestFinal {   //final��̬ȫ�ֱ���ֻ����ʾ��ʼ�����ܸ�ֵ
	final static int a1 = 10; //
	 //finalʵ��ȫ�ֱ���ֻ����ʾ��ʼ�����ܸ�ֵ
	final int a2 = 0;  
	 
	final Aclass REF_VAR = new Aclass();
	public static void main(String[] args) {   
		final int a4;//�βο�����final
	 //final�ֲ��������βΣ����޳�ʼ��ֻ�ܸ�ֵһ��
		  a4 = 5; //a4 = 7;ֻ�ܸ�ֵһ��
		TestFinal tf = new TestFinal();
		 //tf.a2=7;
		 //a1=5;
		System.out.println(tf.REF_VAR.getA());//100
		tf.REF_VAR.setA(1);//1
		System.out.println(tf.REF_VAR.getA());
	}
}