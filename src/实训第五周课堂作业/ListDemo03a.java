package ʵѵ�����ܿ�����ҵ;

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
				write = new FileWriter("E:\\java\\java���\\src\\ʵѵ�����ܿ�����ҵ\\num.txt");
				bufferedWriter = new BufferedWriter(write);
				for(int i = 0;i < list.size(); i++){
	                bufferedWriter.write(list.get(i) + "\r\n");//д�뻻��
	            }
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} finally {
				try {
					bufferedWriter.flush();
					write.flush();
					bufferedWriter.close();
					write.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
			}
	}
	public static void ListSort(ArrayList<Integer> list) {//ListSort���򷽷�
		int [] a = new int[list.size()];
		//��list �е����ݸ���һ�ݸ���ǰ����
		for (int i = 0; i < a.length; i++) {
			a[i] = list.get(i);		
		}
		//�������������
		Arrays.sort(a);
		//���ź�˳�������a�е����ݸ���һ�ݸ�list
			for (int j = 0; j < a.length; j++) {
				list.add(j, a[j]);
			}			
			for (int i = a.length - 1; i > 0; i--) {
				System.out.println(list.get(i));
			}
	}
}
