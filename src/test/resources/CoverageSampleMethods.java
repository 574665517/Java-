package test.resources;

/**
 * @author ywx
 * @ date 2019Äê4ÔÂ4ÈÕ
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
