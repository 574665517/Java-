package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * Ӧ�����ݽṹ ���� ����
Ҫ��: ÿһ��д��һ��������������
�ɷ������أ������û����������
 * @author ywx
 * @ date 2019��5��20��
 */
public class Test05 {

	public static void main(String[] args) {
		int [] i1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};//Դ����
		int [] i2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};//Ŀ������
		copy(i1, 3, i2, 1, 3);//���ÿ�������
		print(i2);//��������
	}
	
	//Դ�������ơ�Դ���鿪ʼ�㡢Ŀ���������ơ�Ŀ�����鿪ʼ�㡢��������
	private static void copy(int[] a, int a1, int[] b, int b2, int len) {
		for (int i = 0; i < len; i++) {
			b[b2 + i] = a[a1 + i];//�޸�Ŀ����������
		}
	}
	
     private static void print(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "\t");
		}
	}
}
