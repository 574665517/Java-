package ע��;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Inherited // ��Annotation���Ա��̳�
//��Annotation����ִ��ʱ��Ȼ��Ч
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyInheritedAnnotation {
	public String name() ; // ����name������������
}
