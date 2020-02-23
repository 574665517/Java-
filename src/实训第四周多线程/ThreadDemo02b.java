package 实训第四周多线程;

import java.util.ArrayList;

/**
 * @author ywx
 * @ date 2019年6月5日
 */
public class ThreadDemo02b {

	public static void main(String[] args) {
		Test t = new Test();
		new Thread(t, "前门").start();
		new Thread(t, "后门").start();
	}
}

class Test implements Runnable {
	static int person = 100;//定义员工数量
	int sumq = 0;//前门人数
	int sumh = 0;//后门人数
	
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
					if(name.equals("前门")) {
						sumq++;
						System.out.println("编号为：" + (100 - person + 1) 
								+ "的员工 从" + name + "入场！拿到的双色球彩票号码是：");
						--person;
						getDoubleColor();
					}
					if(name.equals("后门")) {
						sumh++;
						System.out.println("编号为：" + (100 - person + 1) 
								+ "的员工 从" + name + "入场！拿到的双色球彩票号码是：");
						--person;
						getDoubleColor();
					}
					if(person == 0) {
						System.out.println("从后门入场的员工总共：" + sumh + "");
						System.out.println("从前门入场的员工总共：" + sumq + "");
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

