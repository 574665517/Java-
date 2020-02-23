/**
 *  @author ywx
 *  @ date 2018��8��28��
 */
package ����Date��;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ywx
 * @ date 2018��8��28��
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		//����SimpleDateFormat������������ʱ��ת��ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		sdf.applyPattern(pattern);
		
		//��ʽ����format����Date����ת��ΪString���ͣ�String format��Date date��
		String str = sdf.format(d);
		System.out.println(str);
		
		//������parse����String����ת��ΪDate���ͣ�Date parse��String source��
		Date dd = sdf.parse(str);
		System.out.println(dd);
	}

}
