package string����;

import java.util.Scanner;

public class Demo {

	private void Demo01() {
		String s1 = "xoxx1";
		String s2 = "xoxx1";
		String s3 = "XoXx1";

		// ���ִ�Сд
		System.out.println(s1.equals(s2));// true
		System.out.println(s2.equals(s3));// false

		System.out.println("------------");

		// ���Դ�Сд
		System.out.println(s1.equalsIgnoreCase(s2));// true
		System.out.println(s2.equalsIgnoreCase(s3));// true

		System.out.println("------------");
	}

	private void Demo02() {
		String s1 = "��עxoxx1,ɭ��";
		String s2 = "xoxx1";
		String s3 = "xqxx1";
		String s4 = "��ע";
		String s5 = "ɭ��";

		// �ж��Ƿ����������ַ���
		System.out.println(s1.contains(s2));// true
		System.out.println(s1.contains(s3));// false

		// �ж��Ƿ���ĳ��ָ�����ַ�����ͷ
		System.out.println("-----------");
		System.out.println(s1.startsWith(s4));// true
		System.out.println(s1.startsWith(s5));// false

		// �ж��Ƿ���ĳ��ָ�����ַ�����β
		System.out.println("-----------");
		System.out.println(s1.endsWith(s4));// false
		System.out.println(s1.endsWith(s5));// true

		System.out.println("-----------");
	}

	private void Demo03() {
		String s1 = "xoxx1";
		String s2 = "";
		//String s3 = null;

		// �ж��ַ����Ƿ�Ϊ��
		System.out.println(s1.isEmpty());// false
		System.out.println(s2.isEmpty());// true
		//System.out.println(s3.isEmpty());// java.lang.NullPointerException

		System.out.println("-----------");
	}

	@SuppressWarnings("resource")
	private void Demo04() {
		Scanner sc = new Scanner(System.in);// ���������������
		for (int i = 0; i < 3; i++) {
			System.out.println("�������û�����");
			String userName = sc.nextLine();// ������û����洢��userName��
			System.out.println("���������룺");
			String passWord = sc.nextLine();// ���������洢��passWord��

			// �����ַ����������÷����������������������ݣ���ֹ��ָ���쳣
			if ("admin".equals(userName) && "123".equals(passWord)) {
				System.out.println("��ǰ�û�" + userName + "��½�ɹ���");
				break;
			} else {
				if (i == 2) {
					System.out.println("����ǰ�Ѿ�����������û��������룬�˺��Ѿ�������������ϵ���ۣ�");
				} else {
					System.out.println("�û�����������󣬻��ɳ���" + (2 - i) + "�λ���");
				}
			}
		}
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.Demo01();
		demo.Demo02();
		demo.Demo03();
		demo.Demo04();
	}
}
