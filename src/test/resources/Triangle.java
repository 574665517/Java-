package test.resources;

/**
 * 要求：每条边的值越高满足[0-100]，非法输入返回-1
 * 功能：输入三个整数，判断这三个整数是否可以组成一个正三角形、等腰三角形还是普通三角形
 * 如果能够组成等边三角形，返回结果3，如果组成等腰三角形，返回结果2
 * 如果组成普通三角形，返回结果1，如果不能组成三角形，返回结果0
 * 
 * @param a 三角形第一条边
 * @param b 三角形第二条边
 * @param c 三角形第三条边
 * @return 三角形类型
 * 
 * @author ywx
 * @ date 2019年4月17日
 */
public class Triangle {
	public Integer judgeTrangle(int a, int b, int c) {
		//非法输入
		if(a < 0 || b < 0 || c < 0) return -1;
		if(a > 100 || b > 100 || c > 100) return -1;
		
		//等边三角形返回3
		if(a == b && b == c) return 3;
		
		//等腰三角形返回2
		else if(a == b || b == c) return 2;
		
		//三角形返回1
		else if(a + b > c && b + c > a && a + c > b) return 1;
		
		else return 0;
		
	}
}
