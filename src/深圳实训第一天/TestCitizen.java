package ����ʵѵ��һ��;
public class TestCitizen
{
	public static void main(String[] args)
	{
		Citizen p1 = new Citizen(19111);
		Citizen p2 = new Citizen(19111);
		System.out.println(p1==p2);//�����ĵ�ַ��ͬ,false
		System.out.println(p1.equals(p2));//��ϣ��ַ��ͬ
		System.out.println(p1);//��ϣ��ַ
		System.out.println(p2);
	}
}