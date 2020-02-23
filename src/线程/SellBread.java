package 线程;

/**
 * @author ywx
 * @ date 2019年6月5日
 */

public class SellBread implements Runnable {
	private static int count = 100;
	private Object obj;

	public SellBread(Object obj) {
		this.obj = obj;
	}

//	 public final void setPriority() {
//	 System.out.println();
//	}

	public void run() {
		long begin = System.currentTimeMillis();
		while (count > 0) {
			synchronized (obj) {
				if (count > 0) {
					System.out.println(Thread.currentThread().getName() + ":" + count);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				count--;
			}
			long end = System.currentTimeMillis();
			System.out.println("运行的时间" + (end - begin));
		}
	}

}
