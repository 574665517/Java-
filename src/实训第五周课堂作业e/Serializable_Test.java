package 实训第五周课堂作业e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 将Person对象序列化存储到文件
 * @author ywx
 * @ date 2019年6月14日
 */
public class Serializable_Test {
	 public static void main(String[] args) {
	      	try {
	      		Person p = new Person("张三", 18, true);
	            File f = new File("E:\\java\\java类库\\src\\实训第五周课堂作业e\\file1.txt");
	            FileOutputStream fos = new FileOutputStream(f);
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(p);
	            oos.close();
	            fos.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
