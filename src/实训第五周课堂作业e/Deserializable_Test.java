package ʵѵ�����ܿ�����ҵe;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ���ļ��ж�ȡ���󣬷����л�Deserializable
 * @author ywx
 * @ date 2019��6��14��
 */
public class Deserializable_Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        try {
            File f = new File("E:\\java\\java���\\src\\ʵѵ�����ܿ�����ҵe\\file1.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person)ois.readObject();
            p.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
