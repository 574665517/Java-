package ������;

import java.util.Stack;

/**
 * @author ywx
 * @ date 2019��6��10��
 */
public class StackDemo {
	public static void main(String args[]) {
		Stack<String> s = new Stack<String>();//ʵ����Stack����
		s.push("A"); // ��ջ
		s.push("B"); // ��ջ
		s.push("C"); // ��ջ
		System.out.print(s.pop() + "��") ; // ��ջ
		System.out.print(s.pop() + "��") ; // ��ջ
		System.out.println(s.pop() + "��") ; // ��ջ
		System.out.print(s.pop()+ "��");//����,�쳣,ջΪ��
	}
}
