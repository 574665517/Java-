package 实训第五周课堂作业e;

import java.io.Serializable;

/**
 * 使用Person类作为Object进行示范
注意:Object要能被写入流需要实现Serializable接口
 * @author ywx
 * @ date 2019年6月14日
 */
public class Person implements Serializable {
	 private static final long serialVersionUID = 1L;
	    String name;
	    int age;
	    boolean sex;//true means male  false means female
	    Person(String name, int age, boolean sex) {
	        this.name = name;
	        this.age = age;
	        this.sex = sex;
	    }
	    public void print() {
	        System.out.println("姓名:" + name);
	        System.out.println("年纪:" + age);
	        System.out.println("性别:" + sex);
	    }
}
