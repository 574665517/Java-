package �߳�;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Object obj = new Object();
		Thread t1 = new Thread(new SellTickets(obj), "����һ");
		Thread t2 = new Thread(new SellTickets(obj), "���ڶ�");
		Thread t3 = new Thread(new SellTickets(obj), "������");
		t1.start();
		t1.setPriority(t1.MIN_PRIORITY);
		t2.start();
		t2.setPriority(t2.MAX_PRIORITY);
		t3.start();
		t3.setPriority(t3.NORM_PRIORITY);
		
		
		Thread t4 = new Thread(new SellBread(obj), "����һ");
		Thread t5 = new Thread(new SellBread(obj), "���̶�");
		Thread t6 = new Thread(new SellBread(obj), "������");
		t4.start();
		t5.start();
		t6.start();
	
	}

}
