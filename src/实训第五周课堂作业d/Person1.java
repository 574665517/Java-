package ʵѵ�����ܿ�����ҵd;

/**
 * ͻȻ��һ�죬������Ѫ�������ô����ȥ�ϸ��ɵ���Ҳ
���Ǵ���ӵĸ���������Ҫ��������һ�£�
����ӵĸ����Ǹɵ�
С���ӵĸ����Ǹɵ�
 * @author ywx
 * @ date 2019��6��14��
 */
public class Person1 {
	/**
	 * ��ô���£�С���ӵĸ���Ҳ���ˡ��ɵ���? �������Ӷ�û���ˣ�����Ҫ������Сͷ�ְ֡��ˣ�
	 * ǳ��¡���ܿ�¡��������ݣ��������¡
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * ��Ϊ����ʱsuper.clone()�������õ���Object�ķ������������������ԭ������һ��ǳ�����ķ�ʽ��
		 * ����Ҳ����˵��С���ӵĶ�����ͨ����������Ӳ����ģ�������ͬһ����Ҳ����ͬһ������
		 * �����޸��˴���ӵĸ���ֵ��С����Ҳ�����޸��ˡ�ͬ���С���ӵĸ���Ҳ��һ���������Ҳ������޸ġ�
		 */
		Person f = new Person("Сͷ�ְ�");// ���常��
		Person s1 = new Person("�����", f);// ��������
		System.out.println(s1.getFather());
		// С���ӵ���Ϣ��ͨ������ӿ���������
		Person s2 = s1.clone();
		System.out.println(s2.getFather());
		s2.setName("С����");
		//�ϸɵ�
		s1.getFather().setName("�ɵ�");
		System.out.println(s1.getName() + "�ĸ�����" + s1.getFather().getName());
		System.out.println(s2.getName() + "�ĸ�����" + s2.getFather().getName());
	}

}
