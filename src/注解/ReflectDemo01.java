package ע��;

/**
 * ���н����@java.lang.Deprecated()
SimpleBeanOne ��toString()����ʹ����3��Annotation,����ֻ��Deprecatedʹ��
��RUNTIME�ķ�ʽ����,����ֻ��������ȡ�á�
@author ywx
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectDemo01 {
	public static void main(String args[]) throws Exception {//�쳣�׳�
		Class<?> c = null ; // ȡ��Classʵ��
		c = Class.forName("ע��.SimpleBeanOne");
		Method toM = c.getMethod("toString"); //ȡ��toString()����
		Annotation an[] = toM.getAnnotations(); //ȡ��ȫ����Annotation
		for (Annotation a : an) { // foreach���
		System.out.println(a); // ֱ�������Ϣ
	}
		}
}
