/**
 *  @author ywx
 *  @ date 2019��4��1��
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.resources.ObjectGenerator;

/**
 * @author ywx
 * @ date 2019��4��1��
 */
public class GeneralTest {
	//ʹ��@Test��ע���Է���

	@Test
	public void testGetString() {
		GeneralTest generator = new GeneralTest();
		String msg = generator.getString(); 
        if (msg == null) {
            //Assert��Ҳ��ʹ����ʧ�ܵ�fail����������Ϊʧ����Ϣ���˴�������ʾ��  
            fail("Message is null");
        }    
            //���Եõ���msgΪAString���������ʧ�ܣ���һ������Ϊʧ��ʱ����Ϣ  
            assertEquals("Wrong message generated.", "AString", msg);
	}
        private String getString() {
		// TODO �Զ����ɵķ������
		return "String";
	}
		@Test  
        public void testGetNull() {  
            ObjectGenerator generator = new ObjectGenerator();  
            //����Ϊ��  
            assertNull("Returned object is not null", generator.getNull());  
        }  
        
	
}
