package ʵѵ�����ܿ�����ҵe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ��Person�������л��洢���ļ�
 * @author ywx
 * @ date 2019��6��14��
 */
public class Serializable_Test {
	 public static void main(String[] args) {
	      	try {
	      		Person p = new Person("����", 18, true);
	            File f = new File("E:\\java\\java���\\src\\ʵѵ�����ܿ�����ҵe\\file1.txt");
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
