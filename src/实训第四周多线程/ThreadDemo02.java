package ʵѵ�����ܶ��߳�;


/**
 * @author ywx
 * @ date 2019��6��5��
 */
public class ThreadDemo02 implements Runnable {
	
	private static int i = 1;
	private static int a1 = 0;
	private static int a2 = 0;
//	private static ThreadLocal<Integer> sum = new ThreadLocal<Integer>();
	
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
				if("1".equals(Thread.currentThread().getName())) {
					a1++;
					System.out.println("���Ϊ��" + (i++) + "��Ա���Ӻ����볡��");
				} else {
					a2++;
					System.out.println("���Ϊ��" + (i++) + "��Ա���Ӻ����볡��");
				}
				if(i >= 101) {
					if("1".equals(Thread.currentThread().getName())) {
						System.out.println("�Ӻ����볡��Ա���ܹ���" + a1 + "λԱ��");
					} else {
						System.out.println("�Ӻ����볡��Ա���ܹ���" + a2 + "λԱ��");
					}
					break;
				}
			}
		}
	}
	
}
