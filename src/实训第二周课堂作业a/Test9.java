package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test9 {

	//����Ķ�̬��
	public static void main(String[] args) {//��̬����̬�������п���ߣ����뿴��ߣ����п��ұ�
		Father base = new Son();// ���÷Ǿ�̬����
		base.notStatic();// ���þ�̬��������̬�Ǳ�������ж������
		base.doTest();//��̬����������أ��������أ�û�а취���Ǿ�̬����
		//Son.doTest();
		//Father.doTest();
	}
}

class Father {// ���ྲ̬����
     public static void doTest() {
        System.out.println("���Ǹ��ྲ̬����");
     }
     
     public void notStatic() { // ����Ǿ�̬����
        System.out.println("���Ǹ���Ǿ�̬����");
     }
}

class Son extends Father { // ����ͬ����ͬ�����ľ�̬����
     public static void doTest() {//��Ϊ�Ǿ�̬�������ܸ���
        System.out.println("�������ྲ̬����");
     }
     
     public void notStatic() {// ��д����ķǾ�̬����
        System.out.println("��������Ǿ�̬����");
     }
}
