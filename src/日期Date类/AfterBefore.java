package ����Date��;

import java.util.Date;

/**
 * @author ywx
 * @ date 2018��9��28��
 */
public class AfterBefore {

	public static void main(String[] args) {
		Date beforeDate = new Date(302672606563L);//������ǰ�����ڶ���
		System.out.println("��ǰ�����ڣ�" + beforeDate);//�����ǰ������
		Date nowDate = new Date();//�������ڵ�����
		System.out.println("���ڵ����ڣ�" + nowDate);//������ڵ�����
		//ʹ��after�����ж�����nowDate�Ƿ�������beforeDate֮���������flagΪtrue
		boolean flag = nowDate.after(beforeDate);
		System.out.println("���ڵ���������ǰ������֮����" + flag);
		//ʹ��before�����ж�����nowDate�Ƿ�������beforeDatez֮ǰ���������flag1Ϊtrue
		boolean flag1 = nowDate.before(beforeDate);
		System.out.println("���ڵ���������ǰ������֮����" + flag1);
	}

}
