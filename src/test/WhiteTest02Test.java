/**
 *  @author ywx
 *  @ date 2019��4��3��
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import �������.WhiteTest02;

/**
 * @author ywx
 * @ date 2019��4��3��
 */
class WhiteTest02Test {

	public static WhiteTest02 whitetest02 = new WhiteTest02();
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * {@link �������.WhiteTest02#cabin()} �Ĳ��Է�����
	 */
	@Test
	void testCabin() {
		whitetest02.cabin("1", "3", "5");
		assertEquals(30.5, whitetest02.getKg());
		assertEquals(4.0, whitetest02.getSum());
	}

}
