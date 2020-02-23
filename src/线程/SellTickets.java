package �߳�;

public class SellTickets implements Runnable {
	//Java��ʵ���߳̿�����ʵ��Runnable�ӿ�
	private static int count = 100;
	private Object obj;

	public SellTickets(Object obj) {
		this.obj = obj;
	}

	public void run() {
		while (count > 0) {
			// ����1��2��3
			synchronized (obj) {
				if (count > 0) {
					/**
					 * synchronized �ؼ��֣����������������,�൱�ڲ�����һ���߳�(�����߳�A)�����е��������ʱ,��Ҫ�����û�������߳�B(����C��
					 * D��)�������������(���߸��������ͬ������)���еĻ�Ҫ������ʹ��synchronized�������߳�B(����C
					 * ��D)��������������������д��߳�A,û�еĻ�,����������,Ȼ��ֱ�����С�
					 */
					System.out.println(Thread.currentThread().getName() + ":" + "Ʊ��" + count);
					// ģ���Ʊ�ĳ��������߳�˯��һ��
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count--;
				}
			}
		}
	}

}
