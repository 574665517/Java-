package ʵѵ�ڶ��ܿ��ö�̬;

/**
 * @author ywx
 * @ date 2019��5��22��
 */
public class DoorUser extends Door implements Proof{

	public static void main(String[] args) {
		DoorUser user = new DoorUser();
		user.openDoor();
		user.closeDoor();
		user.theftProof();
		user.fireProof();
		user.waterProof();
	}

	@Override
	public void theftProof() {
		// TODO �Զ����ɵķ������
		System.out.println("����");
	}

	@Override
	public void waterProof() {
		// TODO �Զ����ɵķ������
		System.out.println("��ˮ");
	}

	@Override
	public void bulletProof() {
		// TODO �Զ����ɵķ������
		System.out.println("����");
	}

	@Override
	public void fireProof() {
		// TODO �Զ����ɵķ������
		System.out.println("����");
	}

}
