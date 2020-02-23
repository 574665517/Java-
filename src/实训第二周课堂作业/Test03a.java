package 实训第二周课堂作业;

import java.util.Scanner;

/**
 * 在不同温度时显示不同的解释说明,从控制台接收温度值。
当温度小于10℃ 显示: 10℃有点冷。要多穿衣服；
当温度小于25℃ 显示: 23℃正合适。出去玩吧；
当温度大于25℃ 小于35℃ 显示: 30℃有点热；
当温度大于35℃ 显示: 39℃太热了!开空调；
 * @author ywx
 * @ date 2019年5月20日
 */
public class Test03a {
	
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入当前温度：");
		int temperature = scanner.nextInt();
		
			if (temperature < 10) {
				System.out.println(temperature + "℃有点冷。要多穿衣服；");
			} else if (temperature < 25) {
				System.out.println(temperature + "℃正合适。出去玩吧；");
			} else if (temperature < 35) {
				System.out.println(temperature + "℃有点热；");
			} else {
				System.out.println(temperature + "℃太热了!开空调；");
			}
		}

}
