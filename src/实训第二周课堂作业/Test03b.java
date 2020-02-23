package 实训第二周课堂作业;

import java.util.Scanner;

/**
 *  在不同温度时显示不同的解释说明,从控制台接收温度值。
当温度小于10℃ 显示: 10℃有点冷。要多穿衣服；
当温度小于25℃ 显示: 23℃正合适。出去玩吧；
当温度大于25℃ 小于35℃ 显示: 30℃有点热；
当温度大于35℃ 显示: 39℃太热了!开空调；
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test03b {

	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("如果当前温度小于10度，请输入1"
		 		+ "如果当前温度小于25度，请输入2"
		 		+ "如果当前温度大于25度小于35度，请输入3"
		 		+ "如果当前温度大于35度，请输入4");
		 int temperature = scanner.nextInt();
			switch (temperature) {
			case 1:
				System.out.println(temperature + "℃有点冷。要多穿衣服；");
				break;
			case 2:
				System.out.println(temperature + "℃正合适。出去玩吧；");
				break;
			case 3:
				System.out.println(temperature + "℃有点热；");
				break;
			case 4:
				System.out.println(temperature + "℃太热了!开空调；");
				break;
			}
	}

}
