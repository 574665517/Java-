/**
 *  @author ywx
 *  @ date 2019��4��1��
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import test.resources.Calculator;

/**
 * @author ywx
 * @ date 2019��4��1��
 */
public class CalculatorTest {

	public static Calculator calculator = new Calculator();
	
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}
	
	@Test
	void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	/**
	 * {@link test.resources.Calculator#substract(int)} �Ĳ��Է�����
	 */
	@Test
	void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}

	/**
	 * {@link test.resources.Calculator#divide(int)} �Ĳ��Է�����
	 */
	@Test
	void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}

	/**
	 * {@link test.resources.Calculator#Multiply(int)} �Ĳ��Է�����
	 */
	@Test
	void testMultiply() {
		
	}

}
