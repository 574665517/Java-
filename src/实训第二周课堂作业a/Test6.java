package ʵѵ�ڶ��ܿ�����ҵa;

import java.util.Arrays;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test6 {
	
	//�ַ�������,˭��ǰ˭�ں�

	public static void main(String[] args) {
		String[] strs = { "����(Z)", "����(L)", "����(W)" };
		// ����,Ĭ��������
		Arrays.sort(strs);
		int i = 0;
		for (String str : strs) {
			System.out.println((++i) + " " + str);
		}
	}
}

