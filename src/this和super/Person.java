package this和super;
public class Person {
	String name;
	int age;
	String sex;
	
	/**
	 * 构造方法压栈，先弹出无参的
	 */
	public Person() {
		System.out.println("构造器Person()被调用");
		this.sex ="Male";
		System.out.println("name=" + this.name + " age=" + this.age + " sex=" + this.sex);
	    System.out.println(this);
	}
	public Person(String theName) {
		//调用构造器Person()		
		this();//在构造方法里面，
		System.out.println("构造器Person(String theName)被调用");
		this.name = theName;
		System.out.println("name=" + this.name + " age=" + this.age + " sex=" + this.sex);
	    System.out.println(this);
	}
	public Person(String theName,int theAge) {
		//调用构造器Person(String theName)
		this(theName);
		System.out.println("构造器Person(String theName,int theAge)被调用");
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
