package ʵѵ�����ܿ�����ҵa;

import java.io.Serializable;

/**
 * @author ywx
 * @ date 2019��5��31��
 */
public class InstanceofTest {//instanceof�ж����ͣ��ֱ����ʲô��

	public static void main(String[] args) {//�ж���ߵ��ǲ����ұߵ�ʵ������
		Object hello = "hello";//hello���������Object����
		System.out.println(">>1:" + (hello instanceof Object));//>>1:true������ת��
		System.out.println(">>2:" + (hello instanceof String));//>>2:true
		//Math math = (Math) hello;
		//System.out.println(">>3:" + (math instanceof Math));//����helloת��Math��
		System.out.println(">>4:" + (hello instanceof Comparable));//>>4:true���Ƚ����ӿ�
		System.out.println(">>4:" + (null instanceof Object));//>>4:false�����ܰѿ�ֵת��Object����
		System.out.println(">>5:" + (hello instanceof Serializable));//>>5:true�����л��ӿ�
	}

}
