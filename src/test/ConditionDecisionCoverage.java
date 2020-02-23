package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import test.resources.CoverageSampleMethods;

/**
 * @author ywx
 * @ date 2019��4��4��
 * �����ж�����
 */
class ConditionDecisionCoverage {

	/**
	 * {@link test.resources.CoverageSampleMethods#testMethods(int, int, int)} �Ĳ��Է�����
	 */
	@ParameterizedTest  //����һ������������
	@DisplayName("Condition Decision coverage sample test result true")
	@CsvSource({ //ͨ������һ��String���������������в���ʱ�Ĳ����б�
		//��ÿһ��Stringֵͨ�����ŷָ���Ľ��������ÿһ�β�������ʱ��ʵ�ʲ���ֵ
		"0, 2, 3",
		"1, 0, 3",
	})
	//��һ������testConditionDecisionCoverageTrue����������
	void testConditionDecisionCoverageTrue(int a, int b, int c) {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(a, b, c));
	}
	
	//�ڶ�����������testConditionDecisionCoverageFalse������������ֵ��Ϊ0
	@DisplayName("Condition Decision coverage sample test result false")
	void testConditionDecisionCoverageFalse() {
		CoverageSampleMethods coverageSampleMethods = new CoverageSampleMethods();
		Assertions.assertTrue(coverageSampleMethods.testMethods(0, 0, 0));
	}

}
