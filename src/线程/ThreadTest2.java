package 线程;

/**方法锁实现同步*/
class ThreadDemo implements Runnable {
    int tickets = 20;
    @SuppressWarnings("static-access")
	public void run() {
       while(this.tickets != 0) {
        
		   try {
			   Thread.currentThread().sleep(10);
           } catch(InterruptedException e){
               System.out.println(e);
           } 
           this.sale();
       }

    }

    @SuppressWarnings("static-access")
	private synchronized void sale() {//是否上锁
    	if(tickets > 0) {
    		System.out.println(Thread.currentThread().getName() + " : tickets = " + this.tickets);
    		try {
    			Thread.currentThread().sleep(100);
    		} catch(InterruptedException e) {
    			System.out.println(e);
            }
    		this.tickets--;
    		System.out.println(Thread.currentThread().getName() + " : tickets after= " + this.tickets );
    	}
    }
}


public class ThreadTest2 {
    public static void main(String[] args) {
        ThreadDemo tt = new ThreadDemo();
        Thread t1 = new Thread(tt, "t1");//执行tt对象的run方法
        Thread t2 = new Thread(tt, "t2");
        Thread t3 = new Thread(tt, "t3");
        Thread t4 = new Thread(tt, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}