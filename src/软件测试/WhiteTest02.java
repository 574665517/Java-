/**
 *  @author ywx
 *  @ date 2019��3��6��
 */
package �������;
/**
 * �׺в���
 */

import java.util.Scanner;

public class WhiteTest02 {
	
	private static double sum = 0.0;//�����
	
	private static double kg = 0.0;//��������
	
	public void cabin(String people, String cabin, String dis) {
		
		
//		double kg = 0.0;//����30kg����������
		
		while (true) {// ��ѭ��
			Scanner kg1 = new Scanner(System.in);
			System.out.println("����������������       ");
			Double kg = kg1.nextDouble();
			Double kgg = Math.ceil(kg);
			int kgcopy = kgg.intValue();
			
//			if(kgcopy != kg) {
//				kgcopy = kgcopy + 1;
//			}
//			
			if (kg <= 30.0) {
				System.out.println("����û�г���30kg������Ҫ�������");
			} else {
				if ("1".equals(people)) {
					if ("3".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 4;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 2;
						} 
					} else if ("4".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 6;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 3;
						}
					}
				} else if ("2".equals(people)) {
					if ("3".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 8;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 4;
						} 
					} else if ("4".equals(cabin)) {
						if ("5".equals(dis)) {
							sum = (kgcopy - 30) * 12;
						} else if ("6".equals(dis)){
							sum = (kgcopy - 30) * 6;
						}
					}
				}
				System.out.println("���������" + kgcopy);
				System.out.println("����" + sum + "Ԫ�����");
			}
			
//		if(x.nextDouble() <= 30.0) {//�˿���������������ʮkg
//			System.out.println("����Ҫ�������");
//		} else {
//			System.out.println("�����������й��˿ͻ�������˿�:" + people);
//			System.out.println("���������Ĳ�λ:" + cabin);
//			System.out.println("���������������˻��ǲм���:" + dis);
//			if (people.equals("�й��˿�")) {
//				if(cabin.equals("ͷ�Ȳ�")) {
//					if(dis.equals("������")) {
//						sum = (kg - 30) * 4;
//					}
//					sum = (kg - 30) * 2;
//				} else {
//					if(dis.equals("������")) {
//						sum = (kg - 30) * 6;
//					}
//					sum = (kg - 30) * 3;
//				}
//			} else if (people.equals("����˿�")){
//				if(cabin.equals("ͷ�Ȳ�")) {
//					if(dis.equals("������")) {
//						sum = (kg - 30) * 8;
//					}
//					sum = (kg - 30) * 4;
//				} else {
//					if(dis.equals("������")) {
//						sum = (kg - 30) * 12;
//					}
//					sum = (kg - 30) * 6;
//				}
//			}
//
//		}	
//		System.out.println("�������׼30kg" + kg);
//		System.out.println("����" + sum + "�����");
	}
}
	
	public double getSum() {
	    return sum;
    }
	
	public double getKg() {
	    return kg;
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�й��˿�ѡ1������˿�ѡ2       ");
		String people = scanner.next();
		
		//Scanner cabin = new Scanner(System.in);
		
		Scanner cabin1 = new Scanner(System.in);
		System.out.print("ͷ�Ȳճ˿�ѡ3�������ճ˿�ѡ4       ");
		String cabin = cabin1.next();
		
		Scanner dis1 = new Scanner(System.in);
		System.out.print("�����˿�ѡ5���м��˿�ѡ6       ");
		String dis = dis1.next();
		
		WhiteTest02 t = new WhiteTest02();
		t.cabin(people, cabin, dis);
	}

}
