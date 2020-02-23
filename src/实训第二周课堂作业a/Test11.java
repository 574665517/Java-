package 实训第二周课堂作业a;

/**
 * @author ywx
 * @ date 2019年5月24日
 */
public class Test11 {
	
	/**
	 * 此代码无结果
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			doStuff(-1);
			doStuff(100);
		} catch (Exception e) {
			System.out.println("程序到这里结束");
		}
	}
	@SuppressWarnings("finally")
	public static int doStuff(int _p) throws Exception {
		try {
		if (_p < 0) {
		throw new Exception("数据格式错误");
		} else { 
			return _p; 
		}
	    } catch (Exception e) { 
		    throw e;
	    } finally { 
		    return -1; 
		    }
		}
}


