package string����;

/**
 * @author ywx
 * @ date 2018��7��28��
 */
public class Changdu {

	/**����ַ�������
	 * indexOF()�Ƿ����������ַ����ַ����״γ��ֵ�λ��
	 * lastIndexOf(String str)�÷�������ָ���ַ������һ�γ��ֵ�����λ��
	 * ���ַ����Ŀ�ʼλ�ü��������ַ���str�������һ�γ���str������λ�÷���
	 * @param args
	 */
	public static void main(String[] args) {
		//�����ַ���str
		String str = "We are students";
		//�����ַ�����str�е�����λ�ø���ֵ��size
		int size = str.lastIndexOf("");
		int size1 = str.indexOf("a");
		System.out.println("a��str�е�����λ��" + size1);
		//���������
		System.out.println("���ַ����ַ���str�е�����λ��ʱ��" + size);
		//���ַ���str�ĳ������
		System.out.println("�ַ���str�ĳ����ǣ�" + str.length());
	}

}
