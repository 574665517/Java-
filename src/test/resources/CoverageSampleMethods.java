package test.resources;

/**
 * @author ywx
 * @ date 2019��4��4��
 */
public class CoverageSampleMethods {
	
	public Boolean testMethods(int a, int b, int c) {
		boolean result = false;
		if(a == 1 && b == 2 || c == 3) {
			result = true;
		}
		return result;
	}
}
