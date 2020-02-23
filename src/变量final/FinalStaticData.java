package ����final;

import java.util.Random;

public class FinalStaticData {
	private static Random rand = new Random();
	private final int a1 = rand.nextInt(10); // �������0-10֮�����������趨��Ϊfinal��a1
	private static final int a2 = rand.nextInt(10); // �������0-10֮�����������趨��Ϊfinal��a2

	/**
	 * ����Ϊstatic final��ʽ���������ڴ���Ϊa2������һ���㶨���������
	 * ���ٴ�ʵ����һ������ʱ����Ȼָ��a2����ڴ���������a2ֵ���ֲ���
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		FinalStaticData f = new FinalStaticData();
		System.out.println("����ʵ�����������a1��ֵ��" + f.a1);
		System.out.println("����ʵ�����������a1��ֵ��" + f.a2);
		FinalStaticData f2 = new FinalStaticData();
		System.out.println("����ʵ�����������a1��ֵ��" + f2.a1);
		System.out.println("����ʵ�����������a2��ֵ��" + f2.a2);
	}

}
