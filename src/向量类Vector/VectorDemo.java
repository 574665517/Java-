package 向量类Vector;

import java.util.*;

/**
 * @author ywx
 * @ date 2018年9月9日
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> MyVector = new Vector<String>(100);
		for(int i = 0;i < 3;i++) {//向量中追加元素
			MyVector.addElement("Welcome");
			MyVector.addElement("to");
			MyVector.addElement("Nanchang");
		}
		for(int i = 0;i < MyVector.size();i++) {//显示输出向量序列中的所有元素
			String s = MyVector.elementAt(i);//返回指定索引处的组件
			System.out.print(s + " ");
		}
		System.out.println();
		while(MyVector.removeElement("to"));//删除向量序列中所有的"to"
		for(int i = 0;i < MyVector.size();i++) {
			String s = MyVector.elementAt(i);//返回指定索引处的组件
			System.out.println(s);
		}
	}

}
