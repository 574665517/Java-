package 子类父类;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Person {
	
	private String name;
	private int age;
	 
	public Person(String name){
	  this.name = name;
	}
	 
	public void setName(String name){
	  this.name = name;
	}
	 
	public String getName(){
	   return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
