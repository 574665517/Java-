package 实训第五周课堂作业d;

/**
 * 对象的拷贝2-1
 * 大儿子的父亲是小头爸爸
小儿子的父亲是小头爸爸
 * @author ywx
 * @ date 2019年6月14日
 */

public class Person implements Cloneable {//克隆的标志化接口
	// 姓名
	private String name;
	// 父亲
	private Person father;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, Person father) {
		super();
		this.name = name;
		this.father = father;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	//实现拷贝

	@Override
	public Person clone() {//实现深克隆
		Person p = null;
	try {
		p = (Person)super.clone();
		p.setFather(new Person(p.getFather().getName()));
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return p;
}
	
	/* name和parent的getter/setter方法省略 */
	public static void main(String[] args) throws Exception {
		Person f = new Person("小头爸爸");// 定义父亲
		Person s1 = new Person("大儿子", f);// 定义大儿子
		System.out.println(s1.getFather());//s1的父亲
		// 小儿子的信息是通过大儿子拷贝过来的
		Person s2 = (Person)s1.clone();
		System.out.println(s2.getFather());//s2的父亲
		s2.setName("小儿子");
		System.out.println(s1.getName() + "的父亲是" + s1.getFather().getName());
		System.out.println(s2.getName() + "的父亲是" + s2.getFather().getName());
	}
	
}
