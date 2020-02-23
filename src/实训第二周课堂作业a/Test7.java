package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test7 {
	/**
	 * 接口中只能有参数和未实现的方法
	 * @param args
	 */

	public static void main(String[] args) {
		ImplInterface.ts.methodTS();// 调用接口的实现
	}
}

//被实现的接口
interface ITest {
    public void methodTS();
}
//在接口中存在实现代码，不要在接口中实现接口
interface ImplInterface {
    public static final ITest ts = new ITest() {
        public void methodTS() {
            System.out.println("我在接口中实现了");
        }
    };//匿名内部类，实现的ITest接口
}
