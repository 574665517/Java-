package �쳣;

public class TryCatchDemo {

	public static void main(String[] args) {
		int a, b, c;
		try {
			a = 100;
			b = Integer.parseInt(args[0]);
			c = a/b;
			System.out.println("c= "  + c);
			System.out.println("û���쳣!");
		}
		catch(ArithmeticException e) { //�������������쳣
			System.out.println("�����쳣��" + e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) { //�쳣����
			System.out.println("û���쳣������:" + e.getMessage());
			e.printStackTrace();
		}
		finally {//�����Ƿ����쳣������ͨ�����ڴ����ƺ�������
			System.out.println("ִ�����!");
		}

	}

}
