package �쳣;

public class Take {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try { // try����а������ܳ����쳣�ĳ������
			String str = "lili";
			System.out.println(str + "������");
			int age = Integer.parseInt("20"); // ��������ת��		
		} catch (Exception e) { // catch ����������ȡ�쳣��Ϣ
//			e.getMessage();//����쳣��������
//			e.toString();//�����쳣�����ͺ�����
			e.printStackTrace(); // ����쳣���ͣ����ʣ�ջ��λ��ڳ����е�λ��
		}
		System.out.println("program over");
	}
}
