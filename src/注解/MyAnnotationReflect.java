package ע��;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)//��Annotation����ִ��ʱ��Ȼ��Ч
public @interface MyAnnotationReflect {
	public String key() default "Hello";//����һ��key����,Ĭ��ֵΪ��Hello��
	public String value() default "���޼�";//����һ��value����,Ĭ��ֵΪ�����޼ɡ�
}