package 异常;
@SuppressWarnings("serial")

/**
 * 自定义异常，
 * @author ywx
 * @ date 2019年12月30日
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
	 	return "除以零引起的例外！";
	 }*/
}
public class DivideExceptionTest {                                                                
	public static void main(String args[]) {                                                        
		double n = 20, d = 0.0;                                     
		@SuppressWarnings("unused")
		double q = 0;                                        
	 	try {                                                    
		   	 if(d == 0.0) throw new MyDivideException("除数不能为零");  
	    	System.out.println(n + "/" + d + "=" + n / d);                           
			      
	 	} catch(MyDivideException e) {
	 		System.out.println(e.getMessage());
	 		//System.out.println(e);  
	 		e.printStackTrace(); 
	 	}                                             
	       
	}  
}        