package this��super;
public class Person {
	String name;
	int age;
	String sex;
	
	/**
	 * ���췽��ѹջ���ȵ����޲ε�
	 */
	public Person() {
		System.out.println("������Person()������");
		this.sex ="Male";
		System.out.println("name=" + this.name + " age=" + this.age + " sex=" + this.sex);
	    System.out.println(this);
	}
	public Person(String theName) {
		//���ù�����Person()		
		this();//�ڹ��췽�����棬
		System.out.println("������Person(String theName)������");
		this.name = theName;
		System.out.println("name=" + this.name + " age=" + this.age + " sex=" + this.sex);
	    System.out.println(this);
	}
	public Person(String theName,int theAge) {
		//���ù�����Person(String theName)
		this(theName);
		System.out.println("������Person(String theName,int theAge)������");
		this.age = theAge;
		System.out.println("name=" + this.name + " age=" + this.age + " sex=" + this.sex);
	    System.out.println(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}	
}
