package ʵѵ��һ�ܿ�����ҵ;

/**
 * @author ywx
 * @ date 2019��5��17��
 */
public class YangHuiTriangle01 {

	public static void main(String[] args) {
		int [][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {//�߽縳ֵ1
			a[i][i] = 1;
			a[i][0] = 1;
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 1 ; j < i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			if(i >= j) {
				System.out.print(a[i][j] + "\t");
			}
		}
		System.out.println();
	}
	}
}
