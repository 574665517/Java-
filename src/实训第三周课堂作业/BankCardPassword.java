package ʵѵ�����ܿ�����ҵ;

import java.util.Scanner;
/**
 * @author ywx
 * @ date 2019��5��31��
 */
public class BankCardPassword {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������˺ţ�(ֻ����12��21λ�������)");
		String name = scanner.next();
		
		System.out.println("���������룺(ֻ����6λ)");
		String password = scanner.next();
		
		String regex1 = "\\d{12,21}";//�����ַ������ȵ�\\d{a, b}��ʾ��Χ��\\d{a}��ʾ��С
		String regex2 = "\\d{6}";
		
		if(!name.matches(regex1)) {
			//����ʱ�쳣
			throw new RuntimeException("�û���������Ҫ��");
		} else {
			System.out.println("�û�����ȷ��");
		}
		
		if(!password.matches(regex2)) {
			throw new RuntimeException("���벻����Ҫ��");
		} else {
			System.out.println("������ȷ��");
			System.out.println("��ϲ��"+ name +" ��½�ɹ���");
		}
	}

}