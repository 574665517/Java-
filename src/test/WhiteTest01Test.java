package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import �������.WhiteTest01;

/**
 * @author ywx
 * @ date 2019��4��3��
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
	 * {@link �������.WhiteTest01#Dowork(int, int, int)} �Ĳ��Է�����
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testDowork() {
		whitetest01.Dowork(2, 5, 4);
		equals(6);
	}


}
