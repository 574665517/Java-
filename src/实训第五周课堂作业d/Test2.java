package ʵѵ�����ܿ�����ҵd;

/**
 * ����ĳ������ʲô? 0020
 * @author ywx
 * @ date 2019��6��14��
 */
class ValHold { 
	public int i = 0; 
}
public class Test2 {
	/**
	 * ������Ϊ���õĹ�ϵ.��another�����������ֵ�ܹؼ� v=vh; 
���Ǵ˴���v����main�������v,֮ǰ�������õ���ͬһ������,��vh���õĶ��󸳸�v��
,���������main�������v�����õĶ���ı�.����main�������v״̬ͣ����20��ʱ��.
java�ĺ����Ǵ�ֵ��,����ȥ�Ķ����,�����ǲ��ܸı��,�������ö���״̬�ǿ��Ըı��.
	 * @param args
	 */
	public static void main(String[] args) {//��Ȼ��ֵ���ݵ�����
		Test2 o = new Test2();
		o.amethod();
	}
	public void amethod() {
		int i = 99;
		ValHold v = new ValHold();
		v.i = 30;
//		System.out.println("v:" + v);
		another(v, i);//ֵ���ݣ������ǵ�ֵַ
//		System.out.println("v:" + v);
		System.out.print(v.i);//���ڱ�another����20
	}
	public void another(ValHold v, int i) {//v��i = 99����
		/**
		 * another�����е�v����ָ���������е�V��Ȼ��v.i����Ϊ20��
		 * ���another�����е�v��ָ��vh����ʱ�������е�v.i�Ѿ�����Ϊ��20
		 */
		i = 0;
		v.i = 20;
		ValHold vh = new ValHold();//new�ĳ�Ա�����ǿյ�
//		System.out.println("vh:" + vh);
		v = vh;//vh��ַ���ݸ�v
//		System.out.println("v:" + v);
		System.out.print(v.i);//0
		System.out.print(i);//0
	}
}
