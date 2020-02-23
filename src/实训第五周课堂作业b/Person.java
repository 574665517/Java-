package 实训第五周课堂作业b;

/**
 * @author ywx
 * @ date 2019年6月12日
 */
public class Person { // 定义Person类
	private String name; // 定义name属性
	private int age; // 定义age属性
	
	public Person(String name, int age) { // 通过构造设置属性内容
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		// TODO 自动生成的构造函数存根
	}

	public String getName() { // 取得name属性
		return name;
	}
	public void setName(String name) { // 设置name属性
		this.name = name;
	}
	public int getAge() { // 取得age属性
		return age;
	}
	public void setAge(int age) { // 设置age属性
		this.age = age;
	}
	public void dealArray(int... intArray){  
        for (int i : intArray) {
        	System.out.print(i + " ");
        }                        
    }  
}
