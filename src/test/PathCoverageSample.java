package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import test.resources.CoverageSampleMethods;

/**
 * @author ywx
 * @ date 2019��4��4��
 * ·������
 */
class PathCoverageSample {

	@ParameterizedTest  //����һ������������
	@DisplayName("Path coverage sample test result true")
	@CsvSource({ //ͨ������һ��String���������������в���ʱ�Ĳ����б�
		//��ÿһ��Stringֵͨ�����ŷָ���Ľ��������ÿһ�β�������ʱ��ʵ�ʲ���ֵ
		"1, 2, 0",
		"1, 0, 3",
		"0, 0, 3",
	})
	//��һ������testConditionDecisionCoverageTrue����������
	void testPathCoverageSampleTrue(int a, int b, int c) {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(a, b, c));
	}
	
	@ParameterizedTest  //����һ������������
	@DisplayName("Path coverage sample test result false")
	@CsvSource({ //ͨ������һ��String���������������в���ʱ�Ĳ����б�
		//��ÿһ��Stringֵͨ�����ŷָ���Ľ��������ÿһ�β�������ʱ��ʵ�ʲ���ֵ
		"1, 0, 0",
		"0, 0, 0",
	})
	void testConditionDecisionCoverageFalse(int a, int b, int c) {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertFalse(coverageSampleMethods.testMethods(a, b, c));
	}

}
