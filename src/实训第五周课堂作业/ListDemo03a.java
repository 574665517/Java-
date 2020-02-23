package 实训第五周课堂作业;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo03a {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int random = 0;
		Writer write = null;
		BufferedWriter bufferedWriter = null;
		for (int i = 0; i <= 10; i++) {
			random = (int)(Math.random() * (50));
			list.add(i, random);			
		}
			ListSort(list);
			try {
				write = new FileWriter("E:\\java\\java类库\\src\\实训第五周课堂作业\\num.txt");
				bufferedWriter = new BufferedWriter(write);
				for(int i = 0;i < list.size(); i++){
	                bufferedWriter.write(list.get(i) + "\r\n");//写入换行
	            }
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} finally {
				try {
					bufferedWriter.flush();
					write.flush();
					bufferedWriter.close();
					write.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
			}
	}
	public static void ListSort(ArrayList<Integer> list) {//ListSort排序方法
		int [] a = new int[list.size()];
		//将list 中的数据复制一份给当前数组
		for (int i = 0; i < a.length; i++) {
			a[i] = list.get(i);		
		}
		//对数组进行排序：
		Arrays.sort(a);
		//将排好顺序的数组a中的数据复制一份给list
			for (int j = 0; j < a.length; j++) {
				list.add(j, a[j]);
			}			
			for (int i = a.length - 1; i > 0; i--) {
				System.out.println(list.get(i));
			}
	}
}
