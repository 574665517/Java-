package ע��;

import java.util.Date;

/**
 * @Deprecatedע�͵���Ҫ����,����������һ��������
ʹ�õķ���������ڳ�����ʹ���˴˷����Ļ�,����
����ʱ�����־�����Ϣ��
 * @author ywx
 * @ date 2019��6��13��
 */
class Demo { // ����Demo��
	@Deprecated // ����������ʹ�õĲ���
	public String getInfo() { // �˷����������û�ʹ��
		return "����һ��Demo�ࡣ"; // ������Ϣ
	}
}

public class DeprecatedAnnotationDemo01 {
	@SuppressWarnings("deprecation")//ѹ�ƾ���ʹ���˲��޳�ʹ�õ���򷽷�ʱ�ľ���
	public static void main(String[] args) {
		Demo d = new Demo() ; // ʵ����Demo����
		System.out.println(d.getInfo());//����ʱ,�����־�����Ϣ
		Date date = new Date();
		date.getDate();//replaced by Calendar.get(Calendar.DAY_OF_MONTH)
	}
}
