package ʵѵ�����ܿ�����ҵa;

public class Test12 {//�����������,д�������˵��Ե�ɣ�1234
//	public static void changeStr(String str){//��̬����ֻ��������.����������
//		str = "welcome";
//	}
	
	public static String changeStr(String str){//��̬����ֻ��������.����������
		str = "welcome";
		System.out.println(str);
		return str;
	}
	public static void main(String[] args) {//�ַ����ǲ��ɱ���ַ������У�str���ڴ��ж�1234
		//ȷʵ������ֵ���ݣ��ĳ�"welcome"�������ַ������У���û�иĳ���
		String str = "1234";
		changeStr(str);//���Ƕ�̬����
		System.out.println(str);
	}
}
