package ʵѵ�����ܿ�����ҵa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ywx
 * @ date 2019��5��31��
 */
enum Week {Sun, Mon, Tue, Wed, Thu, Fri, Sat}//���칤���Ʊ�����,���������������?����
public class AsListTest {
	/**
	 * ��������Arrays.asList()���ص���Arrays���ڲ���ArrayList�� ������java.util.ArrayList
	 * Arrays���ڲ���ArrayList��java.util.ArrayList���Ǽ̳�AbstractList��remove��add�ȷ���
	 * ��AbstractList����Ĭ��throw UnsupportedOperationException���Ҳ����κβ���
	 * @param args
	 */
	public static void main(String[]args){
		//���칤����
		Week[] workDays = {Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri};//����ת�ɼ���
		//ת��Ϊ�б�
		List<Week>list = Arrays.asList(workDays);
		List<Week> arrList = new ArrayList(list);//�������
		//��������ҲΪ������
		//list.add(Week.Sat);//Exception in thread "main" java.lang.UnsupportedOperationException
		arrList.add(Week.Sat);
		/*�����տ�ʼ�ɻ���*/
	}
}
