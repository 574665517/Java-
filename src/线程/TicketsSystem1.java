package 线程;
/**
*演示多线程中的同步块和同步方法
*线程调度策略为时间片和轮转
@author admin
*@version 1.0  
*/
public class TicketsSystem1 {
	public static void main(String[] args) {
		SellThread st = new SellThread();
		 new Thread(st).start();
		 new Thread(st).start();
	     new Thread(st).start();
	}
}

class SellThread implements Runnable {
		int tickets = 100;
		Object obj = new Object();
		public void run() {
			while (this.tickets > 0) {
				/*每一个对象都有一个监视器，或者叫做锁。
	  			把obj对象的锁加锁实现语句块同步*/
				synchronized(obj) {
						try {
							Thread.sleep(10);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					 
						if(tickets > 0) {
							System.out.println("obj:"+Thread.currentThread().getName()+
									" sell tickets:"+this.tickets);
							this.tickets--;
						    System.out.println("obj:"+Thread.currentThread().getName()+
									" sell tickets after:"+this.tickets);
						}
					 
				  } 
			 }
		}
	  }
	/*每一个对象都有一个监视器，或者叫做锁。
	 同步方法利用的是this所代表的对象的锁。 
	  把调用该方法对象即this的锁加锁实现方法同步synchronized(this)
	 每个class也有一个锁，是这个class所对应的Class对象的锁。
      静态方法采用类同步
	 public  void sell()
	{
		//synchronized(this)
		{
			if(tickets>0)
			{
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("sell():"+Thread.currentThread().getName()+
						" sell tickets:"+tickets);
				tickets--;
			}
		}
	}
}
*/