package ʵѵ�����ܿ�����ҵe;

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
			notify();//�Ȼ�����һ���߳�
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(sum < 6000) {
			sum += 1000;
				if(Thread.currentThread().getName().equals("�˻�һ")) {
					a += 1000;
					System.out.println(Thread.currentThread().getName() + "Ŀǰ����" + a);
				} else {
					b += 1000;
					System.out.println(Thread.currentThread().getName() + "Ŀǰ����" + b);
				}
			
			System.out.println("Ŀǰ���" + sum);
			try {
				wait();//��ӡ���ȴ���һ�α�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				}
			}
		}
	}

}
