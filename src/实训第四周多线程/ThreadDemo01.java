package ʵѵ�����ܶ��߳�;

/**
 * @author ywx
 * @ date 2019��6��5��
 */

class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "���߳����У�i = " + i);
		}
	}
}

public class ThreadDemo01 {
	public static void main(String[] args) {//�����߳̽���ִ��
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		mt1.start();//�����߳�
		mt2.start();
		mt3.start();
	}

}
