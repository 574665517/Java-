package ʵѵ�����ܿ�����ҵa;

public class Test10 {//�²����ʲô��value is Hello
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
//		if((s.length( ) > 5) && 
//				(s.append("there").equals("False")));//��·�룬���ʽһ����ֱ�Ӳ�������ʽ��
		if((s.append("there").equals("False")) && (s.length( ) > 5));//value is Hellothere
		System.out.println("value is " + s);
	}
}
