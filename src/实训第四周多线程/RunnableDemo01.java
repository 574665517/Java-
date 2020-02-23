package ʵѵ�����ܶ��߳�;

/**
 * @author ywx
 * @ date 2019��6��5��
 */
class MyThread02 implements Runnable {
	private int time;
	private String name;
	
	public MyThread02(String name, int time) {//ͨ�����췽��������������
		this.name = name;
		this.time = time;//Ϊtime���Ը�ֵ
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(name + "�߳�,����ʱ��" + time / 1000 + "��");
	}
}
public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread02 mt1 = new MyThread02("�߳�һ", 10000);//ʵ����Runnable����
		MyThread02 mt2 = new MyThread02("�̶߳�", 20000);//ʵ����Runnable����
		MyThread02 mt3 = new MyThread02("�߳���", 30000);//ʵ����Runnable����
		new Thread(mt1).start();//ʵ����Thread�����
		new Thread(mt2).start();//ʵ����Thread�����
		new Thread(mt3).start();//ʵ����Thread�����
	}
}
	
