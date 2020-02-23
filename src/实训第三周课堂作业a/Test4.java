package 实训第三周课堂作业a;

//import java.math.BigDecimal;

/**
 * 少用float和double，精度太高了
 * @author ywx
 * @ date 2019年5月31日
 */
public class Test4 {//为什么显示剩余金额很奇怪？剩余金额:3000.3008
	public static void main(String[] args) {
		Float totalMeoney = 20000.8f;
		Float ownMeoney = 17000.5f;
		Float leftMeoney = totalMeoney - ownMeoney;
		//这和float的定义有关，当位数达到一定的个数后，还会用科学记数法表示。
		System.out.println("剩余金额:" + leftMeoney.intValue());
		//System.out.println((new BigDecimal(totalMeoney)).subtract(new BigDecimal(ownMeoney)).toBigInteger());
	}
}
