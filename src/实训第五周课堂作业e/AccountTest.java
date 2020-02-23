package 实训第五周课堂作业e;

public class AccountTest {
	public static void main(String[] args) {
		Account c = new Account();
		Thread t1 = new Thread(c, "账户一");
		Thread t2 = new Thread(c, "账户二");
		t1.start();
		t2.start();
	}

}
