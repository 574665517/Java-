package ʵѵ��һ�ܿ�����ҵ;

import java.util.Scanner;

/**
 * @author ywx
 * @ date 2019��5��14��
 */
public class Trim {
	
	public void testTrim() {
		String s1 = "xoxx1  ";
		System.out.println(s1.trim());
	}
	
	public void testReverse() {
//		StringBuffer s2 = new StringBuffer("abcedfg");
//		s2.reverse();// �������ַ���ת
//		System.out.println(s2);
		String s2 = "abcdefg";
		StringBuffer s3 = new StringBuffer(s2.substring(2, 6));
		System.out.println(s2.substring(0, 2) + s3.reverse() + s2.substring(6));
	}
	
	public void testNumber(String sc1, String sc2) {
		int count = 0;
		while(sc1.indexOf(sc2) >= 0) {//����ָ�����ַ������ַ����е�һ�γ��ִ�������
			//����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ����������ַ�����ָ�����������ַ���ʼ��ֱ�����ַ���ĩβ��
			sc1 = sc1.substring(sc1.indexOf(sc2) + sc2.length());
			count++;
		}
		System.out.println("ָ���ַ�����ԭ�ַ����г��֣�" + count + "��");
	}
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Trim trim = new Trim();
		trim.testTrim();
		trim.testReverse();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ԭ�ַ�����");
		String sc1 = sc.next();
		System.out.println("������ָ���ַ�����");
		String sc2 = sc.next();
		trim.testNumber(sc1, sc2);
	}

}
