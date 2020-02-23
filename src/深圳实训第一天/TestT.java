package 深圳实训第一天;

interface if1 {
   public int i = 10;
   void fun1();
}

class TestIf1 implements if1 {
    public void fun1() {
        System.out.println("TestIf1");
    }
    public void fun2() {
        System.out.println("fun2");
    }
}

public class TestT {
     
    public static void main(String[] args) {
    		System.out.println("if1.i = " + if1.i);//10
    		System.out.println("TestIf1.i = " + TestIf1.i);//10
    		if1 t = new TestIf1();//接口的回调
    		t.fun1();
    		//t.fun2();
         
    		if(t instanceof TestIf1) {
    			TestIf1 tt = (TestIf1)t;
    			tt.fun2();
    			System.out.println("t instanceof TestIf1");
    		}
                  
    }
}