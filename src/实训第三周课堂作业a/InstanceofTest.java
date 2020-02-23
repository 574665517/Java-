package 实训第三周课堂作业a;

import java.io.Serializable;

/**
 * @author ywx
 * @ date 2019年5月31日
 */
public class InstanceofTest {//instanceof判断类型，分别输出什么？

	public static void main(String[] args) {//判断左边的是不是右边的实例对象
		Object hello = "hello";//hello是最基本的Object类型
		System.out.println(">>1:" + (hello instanceof Object));//>>1:true，向上转型
		System.out.println(">>2:" + (hello instanceof String));//>>2:true
		//Math math = (Math) hello;
		//System.out.println(">>3:" + (math instanceof Math));//不能hello转成Math类
		System.out.println(">>4:" + (hello instanceof Comparable));//>>4:true，比较器接口
		System.out.println(">>4:" + (null instanceof Object));//>>4:false，不能把空值转成Object类型
		System.out.println(">>5:" + (hello instanceof Serializable));//>>5:true，序列化接口
	}

}
