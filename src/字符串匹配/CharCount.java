package �ַ���ƥ��;

/**
 * @author ywx
 * @ date 2019��5��10��
 */
public class CharCount {
 
	public static void main(String[] args) {
		// ֻ����ȫ��Сд
		String str1 = "abcasdfghjjklloiuyyttreeeccvbbnm";
		
		int[] count = new int[26]; //�����洢Сд��ĸa-z���ֵĴ�����
		
		
		for(int i = 0; i < str1.length(); i++) {
			
			char tmp = str1.charAt(i); //����ȡ��ÿ����ĸ
			int index = tmp - 97; //����ascII�����С�����0.
			count[index] = count[index] + 1;
		}
		
		//ѭ����ӡÿ����ĸ���ִ���
		for(int j = 0; j < count.length; j++){
			if(count[j] != 0)
				System.out.println("��ĸ" + (char)(j + 97) + "���ִ�����" + count[j]);
		}
	}
}
