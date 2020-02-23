package 深圳实训第一天;
public class Citizen
{
	//身份证号
	int id;
	//其他属性略
	public Citizen(int theId)
	{
		this.id = theId;
	}
	//覆盖equals()方法
	public boolean equals(Object obj)
	{
		//首先需要判断obj是否为null，
		//如果为null，返回false
		if (obj == null)
		{
			return false;
		}
		//判断测试的是否为同一个对象，
		//如果是同一个对象，无庸置疑，它应该返回true
		if(this == obj)//多态比较-按obj所指对象的实际类型比较
		{
			return true;
		}
		//判断它们的类型是否相等，
		//如果不相等，则肯定返回false
		if((this.getClass().getName())!=(obj.getClass().getName()))
		{
			return false;
		}
		//将参数中传入的对象造型为Citizen类型
		Citizen c = (Citizen)obj;//造型
		//只需比较两个对象的id属性是否一样，
		//就可以得出这两个对象是否相等
		return ((this.id)==(c.id));
		//return (this.id).equals(c.id);
		}	
      	public int hashCode() {
      		return this.id ;
      	}
	}
/*public class TestCitizen
{
	public static void main(String[] args)
	{
		Citizen p1 = new Citizen("id00001");
		Citizen p2 = new Citizen("id00001");
		System.out.println(p1.equals(p2));
	}
}*/