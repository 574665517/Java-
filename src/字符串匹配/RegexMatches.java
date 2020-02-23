package �ַ���ƥ��;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ywx
 * @ date 2019��3��31��
 * 
 * ����ͨ������ matcher ����� groupCount �������鿴���ʽ�ж��ٸ����顣
 * groupCount ��������һ�� int ֵ����ʾmatcher����ǰ�ж�������顣
 */
public class RegexMatches {
	//�������ǰѶ���ַ���һ��������Ԫ���д���ķ�������ͨ���������ڵ��ַ�������������
	
	public static void main( String args[] ) {
		 
	      // ��ָ��ģʽ���ַ�������
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(\\D*)(\\d+)(.*)";
	 
	      // ���� Pattern ����
	      Pattern r = Pattern.compile(pattern);
	 
	      // ���ڴ��� matcher ����
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
	   }
}
