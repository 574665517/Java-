package ����ʵѵ��һ��;
public class Teacher extends Person
{
	private String department;
	
	public Teacher(String name){
              //super();
			  super(name);
	System.out.println("���ù����� Teacher(String name))");
	}
	
	public void setDepartment(String dept)
	{
		this.department = dept;
	}
	public String getDepartment()
	{
		return this.department;
	}
	
	//��������
	public String showName()
	{
		System.out.println("Teacher123");
	   //return name+"��ʦ";
	 return super.showName()+"��ʦ";
	}
} 