package ��̬;
/**
 * 
 * @author ywx
 * @ date 2019��12��29��
 */
public abstract class Shapes { 
	public  Shapes() {
		System.out.println("Shapes�๹�췽��������");
	}
	/**
	*�ó��ܳ�
	*/
	public abstract double getperimeter();
	
	/**
	*�õ����
	*/
	public abstract double getArea();//���󷽷�����ʵ��
	
	public void draw(Shapes s){}//��ʵ�ַ���
}
