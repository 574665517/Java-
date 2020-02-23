package 封装类;

public class WrapperClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {   
			int i = 10;
			int j = 10;
			System.out.println(i == j);	//true
			//封装类对象的创建
			Short s = new Short((short)1);
			Byte b = new Byte((byte)1);
			Integer i1 = new Integer(10);
			Integer j1 = new Integer(10);
			Float d = new Float("30.5f");
			Boolean B = new Boolean("true");
			Integer i2 = new Integer("10");//Character除外
			Integer j2 = new Integer("10");//Character除外
			System.out.println(i1 == j1);//false
			System.out.println(i1.equals(j1));//true
			System.out.println(i2 == j2);//false
			System.out.println(i2.equals(j2));//true
			System.out.println("------------------------");	
		
			//封装类对象属性的获取(除了Boolean类和Character类）
			int a = i1.intValue();
			System.out.println("封装类对象所表示的基本类型的值 = " + a);
			//简单类型使用它们的封装类调用toString()方法，可转换成字符串
			String str = i2.toString();
			System.out.println("以字符串的形式返回封装类对象表示的基本类型的数据=" + i);
			System.out.println("------------------------");	
			/**封装类和对应基本类型的转换
	  			封装类转换成字符串
			 */
			String str1 = i1.toString();
			System.out.println("以字符串的形式返回封装类对象表示的基本类型的数据 = " + str1);
			/**把字符串转换为封装类对象
     			(除去Character和Boolean类型)
			 */
			Integer k3 = Integer.valueOf("12");//封装类静态方法把整型转化成字符串
    
			//把字符串转换为基本类型的数据
			//(除去Character和Boolean类型)
			int n = Integer.parseInt("123");//封装类的静态方法把字符串转化成整型
			System.out.println(n);
			System.out.println("------------------------");	
			/**封装类可以和基本类型数据进行混合计算
	   			自动装箱_自动拆箱*/
			int k1 = i1 + i;//自动拆箱
			System.out.println("k1=" + k1);
			//返回封装类对象所表示的基本类型的值
			int i6 = i2;//自动拆箱
			Integer i5 = 3;//自动装箱
			int n3 = i1 + i2;//自动拆箱
			System.out.println("封装类对象所表示的基本类型的字符串值 = " + i5); 
			System.out.println("i5 = " + i5);
			System.out.println(n3);
			System.out.println(i1 + j2);//自动拆箱  
	}	
}
