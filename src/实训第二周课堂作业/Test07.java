package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��23��
 */
class Demo01 {
	private String name ;			// ��������
	private static int count = 0 ;	// ���ж����������
	
	public Demo01(){
		count++ ;					// �ж������������
		this.name = "DEMO-" + count ;	// �Զ����б�������
	} 
	
	public Demo01(String name){
		this.name = name;			// ����ͨ�����츳ֵ
	}
	
	public String getName(){		// ȡ������
		return this.name ;
	}
};
public class Test07 {
	public static void main(String args[]){
		System.out.println(new Demo01().getName()) ;
		System.out.println(new Demo01("LXH").getName()) ;
		System.out.println(new Demo01().getName()) ;
		System.out.println(new Demo01("MLDN").getName()) ;
		System.out.println(new Demo01().getName()) ;
	}
};
