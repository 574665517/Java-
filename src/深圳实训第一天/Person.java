package ����ʵѵ��һ��;
public class Person
{
	private String name;
	private int age;
	String sex;
	
	//public Person()
	//{  System.out.println("���ù�����Person()");
	//}
	public Person(String theName)
	{
		//���ù�����Person()
		 //this();
		 this.name = theName;
	System.out.println("���ù�����Person(String name)"+this.name);
	}
	public Person(String theName,int theAge)
	{
		//���ù�����Person(String theName)
		//this(theName);
		this.age = theAge;
	System.out.println("���ù�����Person(String theName,int theAge)");
	}
	
	public String showName()
	{
		//return this.department;
		return this.name;
	}
	public void setName(String theName)
	{
		this.name = theName;
	}
	
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int theAge)
	{
		this.age = theAge;
	}
	
	public String getSex()
	{
		return this.sex;
	}
	public void setSex(String _sex)
	{
		this.sex = _sex;
	}	
    
}