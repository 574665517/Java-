package �쳣;
@SuppressWarnings("serial")

/**
 * �Զ����쳣��
 * @author ywx
 * @ date 2019��12��30��
 */
class MyDivideException extends ArithmeticException {

	public MyDivideException() {
		//super();
	}
	public MyDivideException(String msg) {
		super(msg);
	}
	
	 /*public String toString()
	 {
	 	return "��������������⣡";
	 }*/
}
public class DivideExceptionTest {                                                                
	public static void main(String args[]) {                                                        
		double n = 20, d = 0.0;                                     
		@SuppressWarnings("unused")
		double q = 0;                                        
	 	try {                                                    
		   	 if(d == 0.0) throw new MyDivideException("��������Ϊ��");  
	    	System.out.println(n + "/" + d + "=" + n / d);                           
			      
	 	} catch(MyDivideException e) {
	 		System.out.println(e.getMessage());
	 		//System.out.println(e);  
	 		e.printStackTrace(); 
	 	}                                             
	       
	}  
}        