package ʵѵ��һ�ܿ�����ҵ;

/**
 * ����: 5
���:
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 * @author ywx
 * @ date 2019��5��17��
 */
public class YangHuiTriangle {

	public static void main(String[] args) {
		int [][] a = new int[10][10];
		for (int i = 0; i < 10; i++) { 
		   for (int j = 0; j < a[i].length; j++) { 
		    if (j == 0 || i == j){ 
		       a[i][j] = 1; 
		    } else { 
		      if (i > j){ 
		       a[i][j] = a[i - 1][j - 1] + a[i - 1][j]; 
		      } 
		   } 
		  } 
		} 
		  for (int i = 0; i < a.length; i++) { 
		   for (int j = 0; j < a[i].length; j++) { 
		     if (i >= j) { 
		       System.out.print(a[i][j] + "\t"); 
		     } 
		   } 
		       System.out.println(); 
		  } 
		} 
}
