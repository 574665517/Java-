package 多态;
public class Teacher extends Person
{
	//扩充父类属性
	private String department;
	//扩充父类方法
	public void setDepartment(String theDept)
	{
		this.department = theDept;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public Teacher()
	{     //this.name="123";
	      //this.age=20;
		  this.sex="woman";
	  this.department="教务部";
		}
	//方法覆盖
	public String showName()
	{      //return this.name;
	    return super.showName();//访问父类的对象
	    //return getName()+"Teacher 老师";
	}
	//测试
	public static void main(String[] args)
	{
		Person t = new Teacher();
		 t.setName("Alex");
		System.out.println(t.showName());
	  
	    System.out.println(t.sex);
	}	
}
