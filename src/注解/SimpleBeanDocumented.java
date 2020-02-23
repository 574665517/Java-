package 注解;

@MyDocumentedAnnotation(key = "Hello", value ="LiXingHua")
public class SimpleBeanDocumented {
/**
* 此方法在对象输出时调用,返回对象的信息
*/
@MyDocumentedAnnotation(key = "JXCX", value = "www.JXCXjava.cn")
public String toString() {
	return "Hello LiXingHua!!!";
}
}
