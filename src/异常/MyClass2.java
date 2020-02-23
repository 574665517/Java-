package “Ï≥£;
public class MyClass2 {
    @SuppressWarnings("finally")
	public int fun1() {
	try {
	    return 1;
	} catch(Exception ex) {
	    return 2;
	}
    finally {
	    return 5;
    }
}

    @SuppressWarnings({ "finally", "unused" })
	public int fun2() throws Exception {
        try {
        	int a = 10 / 0;
        	return 3;
        } catch(ArithmeticException ex) {
        	throw new Exception("wrong");
        } finally {
        	System.out.println("finally");
        	return 5;
        }
    }
    
    public static void main(String[] args) {
    	MyClass2 a = new MyClass2();
    	try {
		System.out.println("a.fun1() = " + a.fun1());
    	System.out.println("a.fun2() = " + a.fun2());
     } catch (Exception e) {
    	 System.out.println(e.getMessage());
     }	
    }
}
