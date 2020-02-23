package test.resources;

/**
 * Ҫ��ÿ���ߵ�ֵԽ������[0-100]���Ƿ����뷵��-1
 * ���ܣ����������������ж������������Ƿ�������һ���������Ρ����������λ�����ͨ������
 * ����ܹ���ɵȱ������Σ����ؽ��3�������ɵ��������Σ����ؽ��2
 * ��������ͨ�����Σ����ؽ��1�����������������Σ����ؽ��0
 * 
 * @param a �����ε�һ����
 * @param b �����εڶ�����
 * @param c �����ε�������
 * @return ����������
 * 
 * @author ywx
 * @ date 2019��4��17��
 */
public class Triangle {
	public Integer judgeTrangle(int a, int b, int c) {
		//�Ƿ�����
		if(a < 0 || b < 0 || c < 0) return -1;
		if(a > 100 || b > 100 || c > 100) return -1;
		
		//�ȱ������η���3
		if(a == b && b == c) return 3;
		
		//���������η���2
		else if(a == b || b == c) return 2;
		
		//�����η���1
		else if(a + b > c && b + c > a && a + c > b) return 1;
		
		else return 0;
		
	}
}
