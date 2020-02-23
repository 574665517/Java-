package ʵѵ�����ܶ��߳�;

import java.util.ArrayList;

/**
 * @author ywx
 * @ date 2019��6��5��
 */
public class ThreadDemo02b {

	public static void main(String[] args) {
		Test t = new Test();
		new Thread(t, "ǰ��").start();
		new Thread(t, "����").start();
	}
}

class Test implements Runnable {
	static int person = 100;//����Ա������
	int sumq = 0;//ǰ������
	int sumh = 0;//��������
	
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
				try {
					if(person < 0) {
						return ;
					}
					Thread.sleep(30);
					String name = Thread.currentThread().getName();
					if(name.equals("ǰ��")) {
						sumq++;
						System.out.println("���Ϊ��" + (100 - person + 1) 
								+ "��Ա�� ��" + name + "�볡���õ���˫ɫ���Ʊ�����ǣ�");
						--person;
						getDoubleColor();
					}
					if(name.equals("����")) {
						sumh++;
						System.out.println("���Ϊ��" + (100 - person + 1) 
								+ "��Ա�� ��" + name + "�볡���õ���˫ɫ���Ʊ�����ǣ�");
						--person;
						getDoubleColor();
					}
					if(person == 0) {
						System.out.println("�Ӻ����볡��Ա���ܹ���" + sumh + "");
						System.out.println("��ǰ���볡��Ա���ܹ���" + sumq + "");
						person--;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void getDoubleColor() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(list.size() < 7) {
			int num = (int) (Math.random() * 100);
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		System.out.println(list);
	}
}

