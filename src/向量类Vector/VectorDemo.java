package ������Vector;

import java.util.*;

/**
 * @author ywx
 * @ date 2018��9��9��
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> MyVector = new Vector<String>(100);
		for(int i = 0;i < 3;i++) {//������׷��Ԫ��
			MyVector.addElement("Welcome");
			MyVector.addElement("to");
			MyVector.addElement("Nanchang");
		}
		for(int i = 0;i < MyVector.size();i++) {//��ʾ������������е�����Ԫ��
			String s = MyVector.elementAt(i);//����ָ�������������
			System.out.print(s + " ");
		}
		System.out.println();
		while(MyVector.removeElement("to"));//ɾ���������������е�"to"
		for(int i = 0;i < MyVector.size();i++) {
			String s = MyVector.elementAt(i);//����ָ�������������
			System.out.println(s);
		}
	}

}
