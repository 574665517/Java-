package ��̬����;

import java.lang.reflect.Proxy;

public class DynaProxyDemo {
@SuppressWarnings("null")
public static void main(String[] args) {
	RealSubject realSubject = new RealSubject();
	//ʵ�������������
	MyInvocationHandler handler = new MyInvocationHandler(realSubject);
	//�󶨶���
	Object obj = null;
	Object real = null;
	Subject sub = (Subject)Proxy.newProxyInstance(obj.getClass().getClassLoader(),
			real.getClass().getInterfaces(),handler);
	String info = sub.say("���޼�", 30);// ͨ����̬������÷���
	System.out.println(info); // ��Ϣ���
	}
}
