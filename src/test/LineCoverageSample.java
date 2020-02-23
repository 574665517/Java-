package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.resources.CoverageSampleMethods;

/**
 * @author ywx
 * @ date 2019��4��4��
 * ��串�ǲ���
 */
class LineCoverageSample {

	/**
	 * {@link test.resources.CoverageSampleMethods#testMethods(int, int, int)} �Ĳ��Է�����
	 */
	@Test
	@DisplayName("line coverage sample test")
	void testTestMethods() {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(1, 2, 0));
	}

}
