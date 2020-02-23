package 线程;
/**
 * @author ywx
 * @ date 2019年12月30日
 */
public class TestThread {
	public static void main(String[] args) {
		CreateThread thread = new CreateThread();
		thread.start();
	}
}

class CreateThread extends Thread {
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("thread run" + Thread.currentThread().getName() + i + "times");
		}
		System.out.println("new thread ends");
	}
}
