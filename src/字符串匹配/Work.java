/**
 *  @author ywx
 *  @ date 2019��5��10��
 */
package �ַ���ƥ��;

import java.util.Scanner;

/**
 * ��дһ�������������һ���ַ����У�ָ���ַ������ֵĴ���
      ����һ��ʹ��indexOf��subString������ѭ���жϲ���ȡ
       ��������ʹ��replace�������ַ����滻Ϊ�գ�Ȼ���󳤶�
 * @author ywx
 * @ date 2019��5��10��
 */
public class Work {
	    static Scanner sc = new Scanner(System.in);
	    
		public static void main(String[] args) {
			System.out.println("������ԭ�ַ�����");
			String st = sc.next();
			System.out.println("������ָ���ַ�����");
			String M = sc.next();
			way1(st, M);
			way2(st, M);
		}
		/**
		 * ����һ��ʹ��indexOf��subString������ѭ���жϲ���ȡ
		 */
		public static void way1(String st,String M) {
			int count = 0;
			while(st.indexOf(M) >= 0) {
				st = st.substring(st.indexOf(M) + M.length());
				count++;
			}
			System.out.println("ָ���ַ�����ԭ�ַ����г��֣�" + count + "��");
		}
		/**
		 * ��������ʹ��replace�������ַ����滻Ϊ�գ�Ȼ���󳤶�
		 */
		public static void way2(String st,String M) {
			int count = (st.length() - st.replace(M, "").length()) / M.length();
			System.out.println("ָ���ַ�����ԭ�ַ����г��֣�" + count + "��");
		}
}

