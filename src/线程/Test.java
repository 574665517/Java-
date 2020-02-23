package 线程;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Object obj = new Object();
		Thread t1 = new Thread(new SellTickets(obj), "窗口一");
		Thread t2 = new Thread(new SellTickets(obj), "窗口二");
		Thread t3 = new Thread(new SellTickets(obj), "窗口三");
		t1.start();
		t1.setPriority(t1.MIN_PRIORITY);
		t2.start();
		t2.setPriority(t2.MAX_PRIORITY);
		t3.start();
		t3.setPriority(t3.NORM_PRIORITY);
		
		
		Thread t4 = new Thread(new SellBread(obj), "店铺一");
		Thread t5 = new Thread(new SellBread(obj), "店铺二");
		Thread t6 = new Thread(new SellBread(obj), "店铺三");
		t4.start();
		t5.start();
		t6.start();
	
	}

}
