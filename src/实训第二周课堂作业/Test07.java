package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
class Demo01 {
	private String name ;			// 保存名字
	private static int count = 0 ;	// 所有对象共享此属性
	
	public Demo01(){
		count++ ;					// 有对象产生就自增
		this.name = "DEMO-" + count ;	// 自动进行编名操作
	} 
	
	public Demo01(String name){
		this.name = name;			// 可以通过构造赋值
	}
	
	public String getName(){		// 取得姓名
		return this.name ;
	}
};
public class Test07 {
	public static void main(String args[]){
		System.out.println(new Demo01().getName()) ;
		System.out.println(new Demo01("LXH").getName()) ;
		System.out.println(new Demo01().getName()) ;
		System.out.println(new Demo01("MLDN").getName()) ;
		System.out.println(new Demo01().getName()) ;
	}
};
