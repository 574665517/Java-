package ʵѵ�����ܿ�����ҵc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//�Զ���Service
public @interface Service {
	public String value() default "hello";//����һ��value����
}
