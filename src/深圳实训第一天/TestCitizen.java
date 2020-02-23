package 深圳实训第一天;
public class TestCitizen
{
	public static void main(String[] args)
	{
		Citizen p1 = new Citizen(19111);
		Citizen p2 = new Citizen(19111);
		System.out.println(p1==p2);//真正的地址不同,false
		System.out.println(p1.equals(p2));//哈希地址相同
		System.out.println(p1);//哈希地址
		System.out.println(p2);
	}
}