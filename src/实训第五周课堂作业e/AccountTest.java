package ʵѵ�����ܿ�����ҵe;

public class AccountTest {
	public static void main(String[] args) {
		Account c = new Account();
		Thread t1 = new Thread(c, "�˻�һ");
		Thread t2 = new Thread(c, "�˻���");
		t1.start();
		t2.start();
	}

}
