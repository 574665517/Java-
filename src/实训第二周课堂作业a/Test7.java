package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test7 {
	/**
	 * �ӿ���ֻ���в�����δʵ�ֵķ���
	 * @param args
	 */

	public static void main(String[] args) {
		ImplInterface.ts.methodTS();// ���ýӿڵ�ʵ��
	}
}

//��ʵ�ֵĽӿ�
interface ITest {
    public void methodTS();
}
//�ڽӿ��д���ʵ�ִ��룬��Ҫ�ڽӿ���ʵ�ֽӿ�
interface ImplInterface {
    public static final ITest ts = new ITest() {
        public void methodTS() {
            System.out.println("���ڽӿ���ʵ����");
        }
    };//�����ڲ��࣬ʵ�ֵ�ITest�ӿ�
}
