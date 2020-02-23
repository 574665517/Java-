/**
 *  @author ywx
 *  @ date 2019年4月1日
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.resources.ObjectGenerator;

/**
 * @author ywx
 * @ date 2019年4月1日
 */
public class GeneralTest {
	//使用@Test标注测试方法

	@Test
	public void testGetString() {
		GeneralTest generator = new GeneralTest();
		String msg = generator.getString(); 
        if (msg == null) {
            //Assert中也有使测试失败的fail方法，参数为失败信息（此处仅作演示）  
            fail("Message is null");
        }    
            //断言得到的msg为AString，否则测试失败，第一个参数为失败时的信息  
            assertEquals("Wrong message generated.", "AString", msg);
	}
        private String getString() {
		// TODO 自动生成的方法存根
		return "String";
	}
		@Test  
        public void testGetNull() {  
            ObjectGenerator generator = new ObjectGenerator();  
            //断言为空  
            assertNull("Returned object is not null", generator.getNull());  
        }  
        
	
}
