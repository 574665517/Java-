package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test1 {
	
	//����һ��������,������0,count++ �ķ���ֵ���Լ�֮ǰ��ֵ���޸�Ϊ  count++ ��������
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
		    //count = count++;//�����0,�ȸ�ֵ��++
			count++;
			//count = ++count;//��++��ֵ
		}
		System.out.println("count = " + count);
	}

}
