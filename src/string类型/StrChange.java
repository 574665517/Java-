package string����;

public class StrChange {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello java");
		s1.length();
		System.out.println(s1);
		s1.replace(1, 5, "i");// ��str�����start��end-1֮��������ַ�
		System.out.println(s1);
		s1.delete(0, 3);// ɾ����shart��end-1֮�������ַ�
		System.out.println(s1);
		s1.reverse();// �������ַ���ת
		System.out.println(s1);
		s1.setLength(1);// �����ַ�������
		System.out.println(s1);
		s1.capacity();// �����ַ������������
		System.out.println(s1);
		s1.append(10);
		System.out.println(s1);

	}

}
