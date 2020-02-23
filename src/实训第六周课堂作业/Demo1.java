package 实训第六周课堂作业;

/**
 * @author ywx
 * @ date 2019��6��17��
 */

interface IPrintInter {//�ӿ�
	public void print();
}

public class Demo1 {
	public static void main(String[] args) {
		fun(new IPrintInter() {//�����ڲ���
		@Override
		public void print() {
			System.out.println("Hello World!");
		}
		});
	}
	private static void fun(IPrintInter p) {
		p.print();//�ӿڻص�
	}
	
}
