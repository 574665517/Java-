package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test09 {
	
	@SuppressWarnings("unused")
	public static void doWithStringBuffer() {
		 long start = System.currentTimeMillis();
	     StringBuilder sb = new StringBuilder("a");
	     for(int i = 0; i < 100000; i++) {
	        sb.append("c");
	     }
	     String str = sb.toString();
	     long end = System.currentTimeMillis();
		 System.out.println("StringBuilder的append方法进行字符串拼接需要的时间" + "time :" + (end - start));
	  }
	
	@SuppressWarnings("unused")
	public static void doWithAdd() {
		long start = System.currentTimeMillis();
		String s = "a";
		for (int i = 0; i < 100000; i++){
			s += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("加号进行字符串拼接需要的时间" + "time :" + (end - start));
	}
	
	public static void doWithConcat() {
		long start = System.currentTimeMillis();
		String s = "b";
		for (int i = 0; i < 100000; i++){
			s = s.concat("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("concat方法进行字符串拼接需要的时间" + "time :" + (end - start));
	}
	
	public static void main(String[] args) {
		Test09.doWithStringBuffer();
		Test09.doWithAdd();
		Test09.doWithConcat();
	}

}
