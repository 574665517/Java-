package ʵѵ�����ܶ��߳�;

import java.util.Random;

/**
 * @author ywx
 * @ date 2019��6��5��
 */
public class ThreadDemo02a {

	Random r = new Random();
	public static void main(String[] args) {
		ThreadDemo02 t1 = new ThreadDemo02();
		ThreadDemo02 t2 = new ThreadDemo02();
		new Thread(t1, "1").start();
		new Thread(t2, "2").start();
	}

}
