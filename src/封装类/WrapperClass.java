package ��װ��;

public class WrapperClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {   
			int i = 10;
			int j = 10;
			System.out.println(i == j);	//true
			//��װ�����Ĵ���
			Short s = new Short((short)1);
			Byte b = new Byte((byte)1);
			Integer i1 = new Integer(10);
			Integer j1 = new Integer(10);
			Float d = new Float("30.5f");
			Boolean B = new Boolean("true");
			Integer i2 = new Integer("10");//Character����
			Integer j2 = new Integer("10");//Character����
			System.out.println(i1 == j1);//false
			System.out.println(i1.equals(j1));//true
			System.out.println(i2 == j2);//false
			System.out.println(i2.equals(j2));//true
			System.out.println("------------------------");	
		
			//��װ��������ԵĻ�ȡ(����Boolean���Character�ࣩ
			int a = i1.intValue();
			System.out.println("��װ���������ʾ�Ļ������͵�ֵ = " + a);
			//������ʹ�����ǵķ�װ�����toString()��������ת�����ַ���
			String str = i2.toString();
			System.out.println("���ַ�������ʽ���ط�װ������ʾ�Ļ������͵�����=" + i);
			System.out.println("------------------------");	
			/**��װ��Ͷ�Ӧ�������͵�ת��
	  			��װ��ת�����ַ���
			 */
			String str1 = i1.toString();
			System.out.println("���ַ�������ʽ���ط�װ������ʾ�Ļ������͵����� = " + str1);
			/**���ַ���ת��Ϊ��װ�����
     			(��ȥCharacter��Boolean����)
			 */
			Integer k3 = Integer.valueOf("12");//��װ�ྲ̬����������ת�����ַ���
    
			//���ַ���ת��Ϊ�������͵�����
			//(��ȥCharacter��Boolean����)
			int n = Integer.parseInt("123");//��װ��ľ�̬�������ַ���ת��������
			System.out.println(n);
			System.out.println("------------------------");	
			/**��װ����Ժͻ����������ݽ��л�ϼ���
	   			�Զ�װ��_�Զ�����*/
			int k1 = i1 + i;//�Զ�����
			System.out.println("k1=" + k1);
			//���ط�װ���������ʾ�Ļ������͵�ֵ
			int i6 = i2;//�Զ�����
			Integer i5 = 3;//�Զ�װ��
			int n3 = i1 + i2;//�Զ�����
			System.out.println("��װ���������ʾ�Ļ������͵��ַ���ֵ = " + i5); 
			System.out.println("i5 = " + i5);
			System.out.println(n3);
			System.out.println(i1 + j2);//�Զ�����  
	}	
}
