package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import 软件测试.WhiteTest01;

/**
 * @author ywx
 * @ date 2019年4月3日
 */
class WhiteTest01Test {
	
	public static WhiteTest01 whitetest01 = new WhiteTest01();

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * {@link 软件测试.WhiteTest01#Dowork(int, int, int)} 的测试方法。
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testDowork() {
		whitetest01.Dowork(2, 5, 4);
		equals(6);
	}


}
