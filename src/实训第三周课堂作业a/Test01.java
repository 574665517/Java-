package ʵѵ�����ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��31��
 */
public class Test01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		//X�����ʽ1��char���ͣ����ʽ2��int���ͳ�����0Ҳ������char���ͱ�ʾ�������������������������;���char����
		System.out.println(true ? x : 65536);//88�����ʽ2��int���ͣ�������char�ķ�Χ�����Ҫ������������Ϊint
		System.out.println(true ? x : i);//88�����ʽ1��char���ͣ����ʽ2��int���ͣ����Ҫ��������Ϊint����
		System.out.println(false ? 0 : x);//X�����ʽ1��int���ͳ�������0��char���ͱ�ʾ����������������������������char����
		System.out.println(false ? i : x);//88�����ʽ1��int���ͣ����ʽ2��char���ͣ����Ҫ�������͵�����Ϊint����
	}
}
