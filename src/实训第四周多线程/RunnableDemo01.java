package 实训第四周多线程;

/**
 * @author ywx
 * @ date 2019年6月5日
 */
class MyThread02 implements Runnable {
	private int time;
	private String name;
	
	public MyThread02(String name, int time) {//通过构造方法设置属性内容
		this.name = name;
		this.time = time;//为time属性赋值
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(name + "线程,休眠时间" + time / 1000 + "秒");
	}
}
public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread02 mt1 = new MyThread02("线程一", 10000);//实例化Runnable子类
		MyThread02 mt2 = new MyThread02("线程二", 20000);//实例化Runnable子类
		MyThread02 mt3 = new MyThread02("线程三", 30000);//实例化Runnable子类
		new Thread(mt1).start();//实例化Thread类对象
		new Thread(mt2).start();//实例化Thread类对象
		new Thread(mt3).start();//实例化Thread类对象
	}
}
	
