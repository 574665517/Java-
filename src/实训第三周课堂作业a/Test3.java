package ʵѵ�����ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��31��
 */
public class Test3 {//������װ�����Ƚϣ�false,true
	public static void main(String[] args) {
		Integer one = 128;
		Integer two = 128;
		System.out.println(one == two);//���������-128-127��128����127��ַ����ͬ������false
		Integer one2 = 100;
		Integer two2 = 100;
		System.out.println(one2 == two2);//100С��127��ֱ�Ӵӳ�������ȡ���������������
	}

}
