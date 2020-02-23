package 实训第二周课堂多态;

/**
 * @author ywx
 * @ date 2019年5月22日
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
		// TODO 自动生成的方法存根
		System.out.println("防盗");
	}

	@Override
	public void waterProof() {
		// TODO 自动生成的方法存根
		System.out.println("防水");
	}

	@Override
	public void bulletProof() {
		// TODO 自动生成的方法存根
		System.out.println("防弹");
	}

	@Override
	public void fireProof() {
		// TODO 自动生成的方法存根
		System.out.println("防火");
	}

}
