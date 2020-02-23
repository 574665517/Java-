/**
 *  @author ywx
 *  @ date 2019年4月17日
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import test.resources.Triangle;

/**
 * @author ywx
 * @ date 2019年4月17日
 */
public class TriangleTest {
	private Integer a;
	private Integer b;
	private Integer c;
	@SuppressWarnings("unused")
	private Integer result;
	
	@SuppressWarnings("rawtypes")
	@ParameterizedTest
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{3, 3, 3, 3},
			{3, 3, 4, 2},
			{3, 4, 5, 1},
			{3, 4, 9, 1},
			{3, 4, -1, -1}
		});
	}

    public TriangleTest(Integer a,Integer b, Integer c, Integer result) {
    	this.a = a; 
    	this.b = b; 
    	this.c = c; 
    	this.result = result; 
	}
	
	@Test
	public void testJudgeTrangle() {
		System.out.println("Parameterized Number is : " + a + ", " + b + "," + c);
		Triangle t = new Triangle();
		assertEquals(new Integer(0), t.judgeTrangle(3, 4, 5));
	}

}
