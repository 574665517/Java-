package ��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object obj; // ��ʵ����
	public MyInvocationHandler(Object obj){
		this.obj= obj;
	}
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable { // ��̬���÷���
		//���÷���,������ʵ����Ͳ���
		Object temp = method.invoke(this.obj, args);
		return temp; // ���ط����ķ�����Ϣ
	}
}
