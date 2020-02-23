package 多态;

public class MyDog {//加载到方法区的类代码区
	public static int randomAttack() {//确定谁先攻击的方法
		// result = 1，猫攻击，2，狗攻击
		int result = 0;
		int type = (int) (Math.random() * 10);//获得1-10的随机数，强转为整型
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
          //myDog.Dog();//父类看不见子类新增的
         //myDog.Bark();
    if(myDog instanceof Dog) {//造型，下转型
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
