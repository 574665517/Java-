package �߳�;
/**
*��ʾ�����ڲ���ʵ�ֶ��̶߳�ͬһ��ʵ�������ķ��� 
*��Ctrl+c����
*@author admin
*@version 1.0  
*/
public class MultiThread3
{
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();
		mt.getThread().start();
		 
	}
}

class MyThread  
{
	int index=0;
	/***************************************/
	private class InnerThread extends Thread
	{
		public void run()
		{
			while(index<=10)
			{
				System.out.println(Thread.currentThread().getName()+":"+index++);
			}
		}
	}
	/***************************************/
	Thread getThread()
	{
		return new InnerThread();
	}
	 
}