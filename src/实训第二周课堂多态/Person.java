/**
 *  @author ywx
 *  @ date 2019年5月23日
 */
package 实训第二周课堂多态;

/**
 * @author ywx
 * @ date 2019年5月23日
 */
public class Person implements Runner {

	@Override
	public void start() {
		System.out.println("人会开始");
	}

	@Override
	public void run() {
		System.out.println("人会跑步");
	}

	@Override
	public void stop() {
		System.out.println("人会停下");
	}
	
	public void dance() {
		System.out.println("人会跳舞");
	}

}
