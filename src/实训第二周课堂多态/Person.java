/**
 *  @author ywx
 *  @ date 2019��5��23��
 */
package ʵѵ�ڶ��ܿ��ö�̬;

/**
 * @author ywx
 * @ date 2019��5��23��
 */
public class Person implements Runner {

	@Override
	public void start() {
		System.out.println("�˻Ὺʼ");
	}

	@Override
	public void run() {
		System.out.println("�˻��ܲ�");
	}

	@Override
	public void stop() {
		System.out.println("�˻�ͣ��");
	}
	
	public void dance() {
		System.out.println("�˻�����");
	}

}
