package �߳�;
/**
*��ʾ���߳��е�ͬ�����ͬ������
*�̵߳��Ȳ���Ϊʱ��Ƭ����ת
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
				/*ÿһ��������һ�������������߽�������
	  			��obj�����������ʵ������ͬ��*/
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
	/*ÿһ��������һ�������������߽�������
	 ͬ���������õ���this������Ķ�������� 
	  �ѵ��ø÷�������this��������ʵ�ַ���ͬ��synchronized(this)
	 ÿ��classҲ��һ�����������class����Ӧ��Class���������
      ��̬����������ͬ��
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