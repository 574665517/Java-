package 实训第五周课堂作业e;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 从文件中读取对象，反序列化Deserializable
 * @author ywx
 * @ date 2019年6月14日
 */
public class Deserializable_Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        try {
            File f = new File("E:\\java\\java类库\\src\\实训第五周课堂作业e\\file1.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person)ois.readObject();
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
