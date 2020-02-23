package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import test.resources.CoverageSampleMethods;

/**
 * @author ywx
 * @ date 2019年4月4日
 * 条件组合覆盖
 */
class MultioleConditionCoverageSample {

	@ParameterizedTest  //定义一个参数化测试
	@DisplayName("Multiple Condition Coverage sample test result true")
	@CsvSource({ //通过定义一个String数组来定义多次运行测试时的参数列表，
		//而每一个String值通过逗号分隔后的结果，就是每一次测试运行时的实际参数值
		"1, 2, 3",
		"1, 2, 0",
		"1, 0, 3",
		"0, 2, 3",
		"0, 0, 3",
	})
	void testMultipleConditionCoverageSampleTrue(int a, int b, int c) {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(a, b, c));
	}
	
	@ParameterizedTest
	@DisplayName("Multiple Condition Coverage sample test result false")
	@CsvSource({ //通过定义一个String数组来定义多次运行测试时的参数列表，
		//而每一个String值通过逗号分隔后的结果，就是每一次测试运行时的实际参数值
		"1, 0, 0",
		"0, 0, 0",
		"0, 2, 0",
	})
	void testMultipleConditionCoverageSampleFalse(int a, int b, int c) {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertFalse(coverageSampleMethods.testMethods(a, b, c));
	}

}
