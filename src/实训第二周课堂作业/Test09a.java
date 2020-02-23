package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��25��
 */
public class Test09a {
	/**
	 * append������졣concat������֮���Ӻ�����
	 * @param args
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		long str1StartTime = System.currentTimeMillis();//��¼��ʼʱ��
        String str1 = "a";
        for (int iCount = 0; iCount < 100000; iCount++) {
            str1 += "a";
        }
        long str1EndTime = System.currentTimeMillis();//��¼����ʱ��
 
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
 
        System.out.println("ʹ��String \"+\"����ִ��100000���ַ�ƴ�Ӳ���������ʱ�䣺" + 
        (str1EndTime - str1StartTime) + "����");
        System.out.println("ʹ��String��concat()��������ִ��100000���ַ�ƴ�Ӳ���������ʱ�䣺" + 
        (str2EndTime - str2StartTime) + "����");
        System.out.println("ʹ��StringBuffer��append()��������ִ��100000���ַ�ƴ�Ӳ���������ʱ�䣺" + 
        (str3EndTime - str3StartTime) + "����");
        System.out.println("StringBuilder��append������������ִ��100000���ַ�ƴ�Ӳ���������ʱ�䣺" + 
        (str4EndTime - str4StartTime) + "����");
	}

}
