package 实训第三周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class Test3 {//整数包装类对象比较？false,true
	public static void main(String[] args) {
		Integer one = 128;
		Integer two = 128;
		System.out.println(one == two);//整数缓存池-128-127，128超过127地址不相同，返回false
		Integer one2 = 100;
		Integer two2 = 100;
		System.out.println(one2 == two2);//100小于127，直接从常量池中取数，所以两数相等
	}

}
