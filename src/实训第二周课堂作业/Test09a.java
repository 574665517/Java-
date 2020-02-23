package 实训第二周课堂作业;

/**
 * @author ywx
 * @ date 2019年5月25日
 */
public class Test09a {
	/**
	 * append方法最快。concat方法次之，加号最慢
	 * @param args
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		long str1StartTime = System.currentTimeMillis();//记录起始时间
        String str1 = "a";
        for (int iCount = 0; iCount < 100000; iCount++) {
            str1 += "a";
        }
        long str1EndTime = System.currentTimeMillis();//记录结束时间
 
        long str2StartTime = System.currentTimeMillis();
        String str2 = "b";
        for (int iCount = 0; iCount < 100000; iCount++) {
            str2 = str2.concat("a");
        }
        long str2EndTime = System.currentTimeMillis();
 
        long str3StartTime = System.currentTimeMillis();
        StringBuffer str3 = new StringBuffer("c");
        for (int iCount = 0; iCount < 100000; iCount++) {
            str3 = str3.append("a");
        }
        long str3EndTime = System.currentTimeMillis();
 
        long str4StartTime = System.currentTimeMillis();
        StringBuilder str4 = new StringBuilder("d");
        for (int iCount = 0; iCount < 100000; iCount++) {
            str4 = str4.append("a");
        }
        long str4EndTime = System.currentTimeMillis();
 
        System.out.println("使用String \"+\"操作执行100000次字符拼接操作所消耗时间：" + 
        (str1EndTime - str1StartTime) + "毫秒");
        System.out.println("使用String的concat()方法操作执行100000次字符拼接操作所消耗时间：" + 
        (str2EndTime - str2StartTime) + "毫秒");
        System.out.println("使用StringBuffer的append()方法操作执行100000次字符拼接操作所消耗时间：" + 
        (str3EndTime - str3StartTime) + "毫秒");
        System.out.println("StringBuilder的append（）方法操作执行100000次字符拼接操作所消耗时间：" + 
        (str4EndTime - str4StartTime) + "毫秒");
	}

}
