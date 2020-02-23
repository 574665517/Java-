package 线程;

/**
 * m1线程，m2线程轮流睡醒，随机调度
 * @author ywx
 * @ date 2019年12月30日
 */
  public class Mathine extends Thread {
   public void run() {
	   	for(int a = 0; a < 10; a++){
	   		System.out.println(currentThread().getName() + ":" + a);
	   		try {
	   			sleep(100);
	   		} catch (InterruptedException e) {
	   			throw new RuntimeException(e);
	   		}
	   	}
   }
   
   public static void main(String[] args) {
	   Mathine mathine1 = new Mathine();
	   Mathine mathine2 = new Mathine();
	   //mathine1.setName("m1");
	   //mathine2.setName("m2");
	   mathine1.setPriority(Thread.MAX_PRIORITY);
	   mathine2.setPriority(Thread.MIN_PRIORITY);
	   System.out.println("Priority of m1:" + mathine1.getPriority());
	   System.out.println("Priority of m2:" + mathine2.getPriority());
	   mathine1.start();
	   mathine2.start();
	   mathine1.run();
   }
}