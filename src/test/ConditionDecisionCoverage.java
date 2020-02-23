package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import test.resources.CoverageSampleMethods;

/**
 * @author ywx
 * @ date 2019年4月4日
 * 条件判定覆盖
 */
class ConditionDecisionCoverage {

	/**
	 * {@link test.resources.CoverageSampleMethods#testMethods(int, int, int)} 的测试方法。
	 */
	@ParameterizedTest  //定义一个参数化测试
	@DisplayName("Condition Decision coverage sample test result true")
	@CsvSource({ //通过定义一个String数组来定义多次运行测试时的参数列表，
		//而每一个String值通过逗号分隔后的结果，就是每一次测试运行时的实际参数值
		"0, 2, 3",
		"1, 0, 3",
	})
	//第一个测试testConditionDecisionCoverageTrue会运行两次
	void testConditionDecisionCoverageTrue(int a, int b, int c) {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(a, b, c));
	}
	
	//第二个测试用例testConditionDecisionCoverageFalse的三个参数的值都为0
	@DisplayName("Condition Decision coverage sample test result false")
	void testConditionDecisionCoverageFalse() {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(0, 0, 0));
	}

}
