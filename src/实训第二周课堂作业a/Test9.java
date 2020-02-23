package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test9 {

	//对象的多态性
	public static void main(String[] args) {//多态，动态绑定是运行看左边，编译看左边，运行看右边
		Father base = new Son();// 调用非静态方法
		base.notStatic();// 调用静态方法，静态是编译和运行都看左边
		base.doTest();//静态方法与类相关，与对象不相关，没有办法覆盖静态方法
		//Son.doTest();
		//Father.doTest();
	}
}

class Father {// 父类静态方法
     public static void doTest() {
        System.out.println("我是父类静态方法");
     }
     
     public void notStatic() { // 父类非静态方法
        System.out.println("我是父类非静态方法");
     }
}

class Son extends Father { // 子类同名、同参数的静态方法
     public static void doTest() {//因为是静态方法不能覆盖
        System.out.println("我是子类静态方法");
     }
     
     public void notStatic() {// 覆写父类的非静态方法
        System.out.println("我是子类非静态方法");
     }
}
