package ����Date��;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);//ŷ���˵�ʱ����
		
		//System.out.println(date.toLocaleString());//��������ʱ����
		
		//�������/ʱ���ʽ�����ø�ʽ������Ĭ�����Ի�����Ĭ�ϸ�ʽ�����
		DateFormat df = DateFormat.getTimeInstance();
		String formateDate = df.format(date);//��ʽ������
		System.out.println(formateDate);//�����ʽ��������
		System.out.println(date.getTime());//��ȡ��ǰʱ�����1970��1��1��00:00:00�����ĺ�����
	}

}
