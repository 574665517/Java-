package ��̬;

public class MyDog {//���ص����������������
	public static int randomAttack() {//ȷ��˭�ȹ����ķ���
		// result = 1��è������2��������
		int result = 0;
		int type = (int) (Math.random() * 10);//���1-10���������ǿתΪ����
		if (type > 5) {
			type = 2;
		} else {
			type = 1;
		}
		switch (type) {
		case 1 : result = 1;break;
		case 2 : result = 2;break;	
		}
		return result;
	}
	
  public static void main(String args[]) {
    Animal myDog = new Dog("MyDog");
    Animal yourDog = new Dog("YourDog");
    
    yourDog.setWeight(40);
          //myDog.Dog();//���࿴��������������
         //myDog.Bark();
    if(myDog instanceof Dog) {//���ͣ���ת��
    	((Dog)myDog).Bark();
    	((Dog)myDog).Dog();
              // myDog.Dog();
		      //myDog.Bark();
	}
    
    myDog.bite(yourDog);//30
    myDog.bite(yourDog, 5);//25
    myDog.bite(yourDog);//15
    myDog.bite(yourDog);//5
    myDog.bite(yourDog);//0
    System.out.println("My Dog's Weight is" + myDog.getWeight());
  }
}
