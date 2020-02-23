package 实训第二周课堂作业;

/**
 * 应用数据结构 —— 数组
要求: 每一种写成一个方法，三个形
成方法重载，接收用户输入的年龄
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test05 {

	public static void main(String[] args) {
		int [] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};//源数组
		int [] i2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};//目标数组
		copy(i1, 3, i2, 1, 3);//调用拷贝方法
		print(i2);//调出数组
	}
	
	//源数组名称、源数组开始点、目标数组名称、目标数组开始点、拷贝长度
	private static void copy(int[] a, int a1, int[] b, int b2, int len) {
		for (int i = 0; i < len; i++) {
			b[b2 + i] = a[a1 + i];//修改目标数组内容
		}
	}
	
     private static void print(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "\t");
		}
	}
}
