package �쳣;
public class Test8_6 {
	public void regist(int num) throws MyException {
		if (num < 0) 
			throw new MyException("����Ϊ��ֵ��������",3);
		else
			System.out.println("�Ǽ�����" + num );
        }
        public void manager() {
        	try {
        		regist(100);
        	} catch (MyException e) {
        		System.out.print("�Ǽ�ʧ�ܣ���������"+e.getId());	 	
        	}
        	System.out.print("���εǼǲ�������");
        }
        public static void main(String args[]){
        	Test8_6 t = new Test8_6();
        	t.manager();
        }
}
