package 实训第四周多线程;


/**
 * @author ywx
 * @ date 2019年6月5日
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
					System.out.println("编号为：" + (i++) + "的员工从后门入场！");
				} else {
					a2++;
					System.out.println("编号为：" + (i++) + "的员工从后门入场！");
				}
				if(i >= 101) {
					if("1".equals(Thread.currentThread().getName())) {
						System.out.println("从后门入场的员工总共：" + a1 + "位员工");
					} else {
						System.out.println("从后门入场的员工总共：" + a2 + "位员工");
					}
					break;
				}
			}
		}
	}
	
}
