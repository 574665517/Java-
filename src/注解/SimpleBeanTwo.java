package ע��;

public class SimpleBeanTwo {
	// ʹ��@SuppressWarnings��Annotation
//	@SuppressWarnings("unchecked")
	@Deprecated // ʹ��@Deprecated��Annotation
	@Override // ʹ��@Override��Annotation
	// ʹ���Զ����Annotation������������������
	@MyAnnotationReflect(key = "JXCX", value = "www.JXCX.cn")
	public String toString() { // ��дtoString()����
		return "Hello Annotation!!!" ; // ������Ϣ
	}
}