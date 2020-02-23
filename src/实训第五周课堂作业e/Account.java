package 实训第五周课堂作业e;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account implements Runnable {
	int sum = 0;
	int a = 0;
	int b = 0;
	Lock loc = new ReentrantLock();
	static boolean bool = true;
	public void run() {
		for(int i = 1; i <= 6; i++) {
			synchronized(this) {
			notify();//先唤醒另一个线程
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(sum < 6000) {
			sum += 1000;
				if(Thread.currentThread().getName().equals("账户一")) {
					a += 1000;
					System.out.println(Thread.currentThread().getName() + "目前存了" + a);
				} else {
					b += 1000;
					System.out.println(Thread.currentThread().getName() + "目前存了" + b);
				}
			
			System.out.println("目前余额" + sum);
			try {
				wait();//打印完后等待下一次被唤醒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				}
			}
		}
	}

}
