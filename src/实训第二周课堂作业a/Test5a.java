package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test5a {
	//�ɱ����
	public static void main(String [] args) {
		System.out.println(add(2,3));
		System.out.println(add(2,3,5));
	}
	
    public static int add(int x, int ...args) {
		int sum = x;
		for(int i = 0; i < args.length; i++){
		   sum += args[i];
		}
		  return sum;
	}
}
