/**
 *  @author ywx
 *  @ date 2019��3��26��
 */
package �������;

import java.util.*;
import java.util.regex.*;

public class BlackTest03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("���������룬����ɹ�����ʾ�ɹ���������ʾʧ��!:");
		String Pwd = input.nextLine(); //���������
		isValidPassword(Pwd);
		
		new BlackTest03();
	}

	public static void isValidPassword(String Pwd) {
		if(isOnlyCharAndNum(Pwd) || isContainChar(Pwd)) {
	        System.out.println("Valid Password!");  //������Ч
	    } else {
	        System.out.println("InValid Password!");  //������Ч
	    }
	}

	public static boolean isContainChar(String Pwd) {
		String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(Pwd);
        System.out.println(m.find());
        return false;
	}

	public static boolean isOnlyCharAndNum(String Pwd) {
		for(int i = 0; i < Pwd.length(); i++){
	        if(!Character.isLetter(Pwd.charAt(i)) &&   //�ַ����е�i��Ӧ�ַ��ж��Ƿ�����ĸ
	                !Character.isDigit(Pwd.charAt(i))) {  //�ַ����е�i��Ӧ�ַ��ж��Ƿ�������
	            return false;
	        } else {
	            return true;
	        }
	    }
	    return false;
	}

}
