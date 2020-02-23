package 实训第六周课堂作业;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class StreamTest1 {
	Random random;
	ArrayList<Student> stuList;
	
	@SuppressWarnings("serial")
	@Before
	public void init() {
		random = new Random();
		stuList = new ArrayList<Student>() {
			{ 
				for (int i = 0; i < 100; i++) {
					add(new Student("student" + i, random.nextInt(50) + 50)); 
				}
			} 
		}; 
	}
	@Test
	public void test1() {
		List<String> studentList = stuList.stream()
				.filter(x -> x.getScore() > 85)//过滤，成绩大于85把它取出来，85分以上的筛出来了
				//排序                                                       //方法引用，肯定是正序排列  //翻转
				.sorted(Comparator.comparing(Student::getScore).reversed())
				.map(Student::getName)
				.collect(Collectors.toList());//流式集合转成List集合，下面打印转成的集合
		System.out.println(studentList);//对成绩进行排序，还是降序排序
	}
}