package 子类父类;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Student extends Person {
	
	private String school;

	public Student(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
