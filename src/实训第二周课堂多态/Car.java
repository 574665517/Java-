package 实训第二周课堂多态;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Car implements Runner {

	@Override
	public void start() {
		System.out.println("车会开始");
	}

	@Override
	public void run() {
		System.out.println("车会跑步");
	}

	@Override
	public void stop() {
		System.out.println("车会停下");
	}
	
	public void fillFuel() {
		System.out.println("车会加油");
	}
	
	public void crack() {
		System.out.println("车会抛锚");
	}

}
