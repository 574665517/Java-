package ��̬;
public class Teacher extends Person
{
	//���丸������
	private String department;
	//���丸�෽��
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
	  this.department="����";
		}
	//��������
	public String showName()
	{      //return this.name;
	    return super.showName();//���ʸ���Ķ���
	    //return getName()+"Teacher ��ʦ";
	}
	//����
	public static void main(String[] args)
	{
		Person t = new Teacher();
		 t.setName("Alex");
		System.out.println(t.showName());
	  
	    System.out.println(t.sex);
	}	
}
