package ʵѵ�ڶ��ܿ�����ҵa;

/**
 * @author ywx
 * @ date 2019��5��24��
 */
public class Test11 {
	
	/**
	 * �˴����޽��
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			doStuff(-1);
			doStuff(100);
		} catch (Exception e) {
			System.out.println("�����������");
		}
	}
	@SuppressWarnings("finally")
	public static int doStuff(int _p) throws Exception {
		try {
		if (_p < 0) {
		throw new Exception("���ݸ�ʽ����");
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


