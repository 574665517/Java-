/**
 *  @author ywx
 *  @ date 2018��8��13��
 */
package string����;

/**
 * @author ywx
 * @ date 2018��8��13��
 */
public class StringBuilderDemo {

	/**
	 * �ַ���������
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "";//�������ַ���
		//������ַ���ִ�в�������ʼʱ��
		long starTime = System.currentTimeMillis();
		for(int i = 0;i < 10000;i++) {//����forѭ��ִ��10000�β���
			str = str + i;//ѭ��׷���ַ���
		}
		long endTime = System.currentTimeMillis();//�����ַ����������ʱ��
		long time = endTime - starTime;//������ַ���ִ�в�����ʱ��
		System.out.println("String���ĵ�ʱ�䣺"+ time);
		StringBuilder buider = new StringBuilder("");//�����ַ���������
		starTime = System.currentTimeMillis();//�����ַ�������ǰʱ��
		for(int j = 0; j < 10000; j++) {
			buider.append(j);
		}
		endTime = System.currentTimeMillis();//����������ʱ��
		time = endTime - starTime;
		System.out.println("StringBuider���ĵ�ʱ�䣺"+ time);
	}

}
