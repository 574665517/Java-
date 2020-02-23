package 实训第二周课堂多态;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Bird implements Runner {

	@Override
	public void start() {
		System.out.println("鸟会开始");
	}

	@Override
	public void run() {
		System.out.println("鸟会跑步");
	}

	@Override
	public void stop() {
		System.out.println("鸟会停止");
	}
	
	public void fly() {
		System.out.println("鸟会飞");
	}

}
