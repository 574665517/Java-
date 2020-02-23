package 实训第六周课堂作业;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author ywx
 * @ date 2019年6月17日
 */
public class StreamTest {
	
	Random random;
	ArrayList<Student> stuList;

	@SuppressWarnings("serial")
	public void init() {
		random = new Random();
		stuList = new ArrayList<Student>() {
			{ 
				for (int i = 0; i < 10000; i++) {
					add(new Student("student" + i, random.nextInt(50) + 50)); 
				}
			} 
		}; 
	}
	
	public void test1() {
		Stream<Student> studentList = stuList.stream()
				.filter(x -> x.getScore() > 85);
		System.out.println(studentList);
	}
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		StreamTest st = new StreamTest();
		st.test1();
		long end = System.currentTimeMillis();
		System.out.println("Stream需要的时间:" + (end - begin));
	}

}
