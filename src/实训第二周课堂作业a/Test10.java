package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test10 {
	/**
	 * ����������son1��test������
	 * son1��test�����̳�FatherA
	 * FatherA new��һ��Other����
	 * Other������new ��son1
	 * �������޵ݹ飬���¶�ջ����
	 * @param args
	 */

	public static void main(String[] args) {
		Son1 s = new Son1();
		s.test();
	}
}

class FatherA {// ����
    FatherA() {
        new Other();
    }
}

class Son1 extends FatherA {// ����
    public void test() {
        System.out.println("Hi, show me test");
    }
}

class Other {// �����
    public Other() {
    	new Son1(); 
    }
}
