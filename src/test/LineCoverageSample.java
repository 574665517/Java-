package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.resources.CoverageSampleMethods;

/**
 * @author ywx
 * @ date 2019年4月4日
 * 语句覆盖测试
 */
class LineCoverageSample {

	/**
	 * {@link test.resources.CoverageSampleMethods#testMethods(int, int, int)} 的测试方法。
	 */
	@Test
	@DisplayName("line coverage sample test")
	void testTestMethods() {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(1, 2, 0));
	}

}
