package ����ʵѵ��һ��;

/**
 * @author ywx
 * @ date 2019��12��27��
 */
public class MyPoint {
//	private int start;
//	private int end;

	public static void main(String[] args) {
//		Point start = new Point();
//		start.setX(10);
//		start.setY(10);
//		Point end = new Point();
//		end.setX(20);
//		end.setY(20);
//		System.out.println(start.getX());
//		System.out.println(start.getY());
//		System.out.println(end.getX());
//		System.out.println(end.getY());
		Point end = new Point();
		end.setX(10);
		end.setY(10);
		Point stray = new Point();
		stray = end;
		System.out.println("��һ�α���");
		System.out.println(end.getX());
		System.out.println(end.getY());
		System.out.println(stray.getX());
		System.out.println(stray.getY());
		
		stray.setX(50);//����stary�����ĳ�Աx��y��ֵ
		stray.setY(50);
		System.out.println("�ڶ��α���");
		System.out.println(end.getX());
		System.out.println(end.getY());
		System.out.println(stray.getX());
		System.out.println(stray.getY());
		
		Point start = new Point();//����start�����ĳ�Աx��y��ֵ
		start.setX(40);
		start.setY(40);
		System.out.println("�����α���");
		System.out.println(start.getX());
		System.out.println(start.getY());
		System.out.println(end.getX());
		System.out.println(end.getY());
	}

}
