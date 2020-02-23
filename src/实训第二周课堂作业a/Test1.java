package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test1 {
	
	//来猜一猜输出结果,输出结果0,count++ 的返回值是自加之前的值，修改为  count++ 及是自增
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
		    //count = count++;//结果是0,先赋值后++
			count++;
			//count = ++count;//先++后赋值
		}
		System.out.println("count = " + count);
	}

}
