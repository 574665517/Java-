package �βκ�ʵ��;

public class Test01 {
	private static int intStatic = 222;
	private static String stringStatic = "old string";
	private static StringBuilder stringBuilderStatic = new StringBuilder("old stringBuilder");

	public static void main(String[] args) {
		//ʵ�ε���
		method(intStatic);
		method(stringStatic);
		method(stringBuilderStatic, stringBuilderStatic);
		
		//�����Ȼ��222(��1��)
		System.out.println(intStatic);
		method();
		//�޲η�������֮�󣬷����޸�Ϊ888(��2��)
		System.out.println(intStatic);
		//�����Ȼ�ǣ�old string
		System.out.println(stringStatic);
		//�������ο��·�����
		System.out.println(stringBuilderStatic);
	}
	//A����
    public static void method(int intStatic) {
		intStatic = 777;
	}
    //B����
    public static void method() {
		intStatic = 888;
	}
    //C����
    public static void method(String stringStatic) {
		//String��immutable����Stringû���ṩ�κη��������޸Ķ���
    	stringStatic = "new string";
	}
    //D����
    public static void method(StringBuilder stringBuilderStatic1, StringBuilder stringBuilderStatic2) {
		//ֱ��ʹ�ò��������޸Ķ���(��3��)
    	stringBuilderStatic1.append(".method.first-");
    	stringBuilderStatic2.append("method.second-");
    	
    	//�������¸�ֵ
    	stringBuilderStatic1 = new StringBuilder("new stringBuilder");
    	stringBuilderStatic1.append("new method's append");
	}

}
