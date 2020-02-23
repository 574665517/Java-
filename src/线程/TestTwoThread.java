package Ïß³Ì;

public class TestTwoThread {
	public static void main(String[] args) {
		TwoThread thread1 = new TwoThread("thread1");
		TwoThread thread2 = new TwoThread("thread2");
		thread1.start();
		thread2.start();
		System.out.println("threads started ,main ends\n");

	}

}

class TwoThread extends Thread {
	private int sleepTime;

	public TwoThread(String time) {
		super(time);
		sleepTime = (int) (Math.random() * 6000);
	}

	public void run() {
		System.out.println(getName() + "going to sleep for" + sleepTime);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + "finished");

	}
}
