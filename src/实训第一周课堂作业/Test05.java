package 实训第一周课堂作业;

/**
 * 写一个程序，找出4位数的所有吸血鬼的数字。
 * @author ywx
 * @ date 2019年5月16日
 */
public class Test05 {

	/**
	 * 位数为偶数的数字可以由一对数字相乘而等到
	 * 这对数字各包含乘积的一半位数的数字
	 * 1260 = 21 * 60
       1827 = 21 * 87
       2187 = 27 * 81
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2,result, i, j, count = 0;
		int [] predata = new int [4];
		int [] lastdata = new int [4];
		for(num1 = 10; num1 < 99; num1++) {
			for(num2 = num1; num2 < 99; num2++) {
				result = num1 * num2;
				count = 0;
				if(((num1 * num2) % 9) != ((num1 + num2) % 9)) {
					continue;
				}
				predata[0] = num1 / 10;
				predata[1] = num1 % 10;
				predata[2] = num2 / 10;
				predata[3] = num2 % 10;
				lastdata[0] = result / 1000;
				lastdata[1] = (result % 1000) / 100;
				lastdata[2] = (result % 1000 % 100) / 10;
				lastdata[3] = (result % 1000 % 100 % 10);
				for(i = 0; i < 4; i++) {
					for(j = 0; j < 4; j++) {
						if(predata[i] == lastdata[j]) {
							count++;
							predata[i] = -1;
							lastdata[j] = -2;
						}
					}
					if(count == 4)
						System.out.println(num1 + "*" + num2 + "=" + result);
				}
			}
		}
	}

}
