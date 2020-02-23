package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test03 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
		System.out.println(list);
		Integer [] myArray = { 1, 2, 3 };
		List<?> myList = Arrays.stream(myArray).collect(Collectors.toList());
		//��������Ҳ����ʵ��ת��������boxed��װ�������
		System.out.println(myList);
		int [] myArray2 = { 1, 2, 3 };
		List<?> myList1 = Arrays.stream(myArray2).boxed().collect(Collectors.toList());
		System.out.println(myList1);
	}
}

