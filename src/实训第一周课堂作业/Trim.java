package 实训第一周课堂作业;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019年5月14日
 */
public class Trim {
	
	public void testTrim() {
		String s1 = "xoxx1  ";
		System.out.println(s1.trim());
	}
	
	public void testReverse() {
//		StringBuffer s2 = new StringBuffer("abcedfg");
//		s2.reverse();// 接收者字符逆转
//		System.out.println(s2);
		String s2 = "abcdefg";
		StringBuffer s3 = new StringBuffer(s2.substring(2, 6));
		System.out.println(s2.substring(0, 2) + s3.reverse() + s2.substring(6));
	}
	
	public void testNumber(String sc1, String sc2) {
		int count = 0;
		while(sc1.indexOf(sc2) >= 0) {//返回指定子字符串在字符串中第一次出现处的索引
			//返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
			sc1 = sc1.substring(sc1.indexOf(sc2) + sc2.length());
			count++;
		}
		System.out.println("指定字符串在原字符串中出现：" + count + "次");
	}
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Trim trim = new Trim();
		trim.testTrim();
		trim.testReverse();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入原字符串：");
		String sc1 = sc.next();
		System.out.println("请输入指定字符串：");
		String sc2 = sc.next();
		trim.testNumber(sc1, sc2);
	}

}
