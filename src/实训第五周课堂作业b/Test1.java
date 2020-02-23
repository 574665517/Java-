package 实训第五周课堂作业b;

import java.lang.reflect.Field;

public class Test1 {

	public static void main(String[] args) throws Exception {
      Person person = new Person();
      Class<? extends Person> clazz = person.getClass();
      
      Object obj = clazz.newInstance();
      Field field = clazz.getField("name");
      field.set(obj, "xiaohua");
      Object o = field.get(obj);
      System.out.println(o);
	}

}
