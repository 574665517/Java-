package ʵѵ�ڶ��ܿ��ö�̬;

/**
 * @author ywx
 * @ date 2019��5��23��
 */
public class Car implements Runner {

	@Override
	public void start() {
		System.out.println("���Ὺʼ");
	}

	@Override
	public void run() {
		System.out.println("�����ܲ�");
	}

	@Override
	public void stop() {
		System.out.println("����ͣ��");
	}
	
	public void fillFuel() {
		System.out.println("�������");
	}
	
	public void crack() {
		System.out.println("������ê");
	}

}
