package ��̬;
public class Person
{
	private  String name;
	private int age;
	String sex;
	public Person()
	{ this.name="tom";
	  this.age=20;
	  this.sex="man";
	 //this.department="����";
	}
	public String showName()
	{
		return this.name;
	}
	public String getName()
	{
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
	public void setSex(String theSex)
	{
		this.sex = theSex;
	}	
}
