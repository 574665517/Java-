package ����ʵѵ��һ��;
public class Citizen
{
	//���֤��
	int id;
	//����������
	public Citizen(int theId)
	{
		this.id = theId;
	}
	//����equals()����
	public boolean equals(Object obj)
	{
		//������Ҫ�ж�obj�Ƿ�Ϊnull��
		//���Ϊnull������false
		if (obj == null)
		{
			return false;
		}
		//�жϲ��Ե��Ƿ�Ϊͬһ������
		//�����ͬһ��������ӹ���ɣ���Ӧ�÷���true
		if(this == obj)//��̬�Ƚ�-��obj��ָ�����ʵ�����ͱȽ�
		{
			return true;
		}
		//�ж����ǵ������Ƿ���ȣ�
		//�������ȣ���϶�����false
		if((this.getClass().getName())!=(obj.getClass().getName()))
		{
			return false;
		}
		//�������д���Ķ�������ΪCitizen����
		Citizen c = (Citizen)obj;//����
		//ֻ��Ƚ����������id�����Ƿ�һ����
		//�Ϳ��Եó������������Ƿ����
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