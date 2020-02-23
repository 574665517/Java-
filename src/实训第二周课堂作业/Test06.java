package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月23日
 */

class Demo {    // 定义类
	    private static int count = 0 ;    // 所有对象共享此属性
	    public Demo() {
	        count++ ;                     // 只要有对象产生就应该自增
	        System.out.println("产生了" + count + "个对象！") ;
	    } 
	}
	
	public class Test06 {
	    public static void main(String args[]) {
	        new Demo() ;            // 增加新对象
	        new Demo() ;            // 增加新对象
	        new Demo() ;            // 增加新对象
	    }
	}

