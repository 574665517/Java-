package ʵѵ�����ܿ�����ҵ;

import java.util.Random;

/**
 * @author ywx
 * @ date 2019��6��10��
 */
public class ListDemo03 {

	public static void main(String[] args) {
		int max = 50;
        int min = 1;
        int[] ra = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int s = random.nextInt(max) % (max - min + 1) + min;
            ra[i] = s;
            if(s % 2 == 0) {
            	System.out.println(s);
            }
        }
	}

}
