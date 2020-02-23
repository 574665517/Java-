package 深圳实训第一天;
public class Teacher extends Person
{
	private String department;
	
	public Teacher(String name){
              //super();
			  super(name);
	System.out.println("调用构造器 Teacher(String name))");
	}
	
	public void setDepartment(String dept)
	{
		this.department = dept;
	}
	public String getDepartment()
	{
		return this.department;
	}
	
	//方法覆盖
	public String showName()
	{
		System.out.println("Teacher123");
	   //return name+"老师";
	 return super.showName()+"老师";
	}
} 