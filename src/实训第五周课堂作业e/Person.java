package ʵѵ�����ܿ�����ҵe;

import java.io.Serializable;

/**
 * ʹ��Person����ΪObject����ʾ��
ע��:ObjectҪ�ܱ�д������Ҫʵ��Serializable�ӿ�
 * @author ywx
 * @ date 2019��6��14��
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
	        System.out.println("����:" + name);
	        System.out.println("���:" + age);
	        System.out.println("�Ա�:" + sex);
	    }
}
