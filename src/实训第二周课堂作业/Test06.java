package ʵѵ�ڶ��ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��23��
 */

class Demo {    // ������
	    private static int count = 0 ;    // ���ж����������
	    public Demo() {
	        count++ ;                     // ֻҪ�ж��������Ӧ������
	        System.out.println("������" + count + "������") ;
	    } 
	}
	
	public class Test06 {
	    public static void main(String args[]) {
	        new Demo() ;            // �����¶���
	        new Demo() ;            // �����¶���
	        new Demo() ;            // �����¶���
	    }
	}

