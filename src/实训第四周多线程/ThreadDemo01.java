package 实训第四周多线程;

/**
 * @author ywx
 * @ date 2019年6月5日
 */

class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "子线程运行，i = " + i);
		}
	}
}

public class ThreadDemo01 {
	public static void main(String[] args) {//两个线程交替执行
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		mt1.start();//启动线程
		mt2.start();
		mt3.start();
	}

}
