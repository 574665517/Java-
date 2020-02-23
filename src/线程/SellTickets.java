package 线程;

public class SellTickets implements Runnable {
	//Java中实现线程靠的是实现Runnable接口
	private static int count = 100;
	private Object obj;

	public SellTickets(Object obj) {
		this.obj = obj;
	}

	public void run() {
		while (count > 0) {
			// 窗口1，2，3
			synchronized (obj) {
				if (count > 0) {
					/**
					 * synchronized 关键字，代表这个方法加锁,相当于不管哪一个线程(例如线程A)，运行到这个方法时,都要检查有没有其它线程B(或者C、
					 * D等)正在用这个方法(或者该类的其他同步方法)，有的话要等正在使用synchronized方法的线程B(或者C
					 * 、D)运行完这个方法后再运行此线程A,没有的话,锁定调用者,然后直接运行。
					 */
					System.out.println(Thread.currentThread().getName() + ":" + "票号" + count);
					// 模拟出票的场景，让线程睡眠一会
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
