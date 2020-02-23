package �ַ���ƥ��;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ywx
 * @ date 2019��3��31��
 */
public class RegexMatches01 {
	//������һ���Ե��� "cat" �����������ַ����г��ִ������м��������ӣ�
	private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
                                    "cat cat cat cattie cat";
 
    public static void main( String args[] ) {
       Pattern p = Pattern.compile(REGEX);
       Matcher m = p.matcher(INPUT); // ��ȡ matcher ����
       int count = 0;
 
       while(m.find()) {
         count++;
         System.out.println("Match number " + count);
         System.out.println("start(): " + m.start());
         System.out.println("end(): " + m.end());
      }
   }
}
