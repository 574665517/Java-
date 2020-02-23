package 多态;
public class Dog extends Animal {	
	
	public Dog() {}
	
	public Dog(String _name) {
	    System.out.println("Dog(String _name)");
		this.name = _name;
    }
        
	public void Dog() {//新增的方法
	    System.out.println("Wang~~");
	}
	
	/**
	*子类新增方法
	*/
	public void Bark() {
		this.weight = 40;
		System.out.println("Wang~~Wang~~~");
	}
	//*
	public void bite(Animal a) {
		System.out.println(this.name + " bite " + a.name);
		if(a.weight > 10) {
		   a.weight -= 10;
		   System.out.println(a.name + " weight is " + a.weight);
		} else {
		   a.weight = 0;
		   System.out.println(a.name + "is Dead!");
		}
	}//*/
	
	protected void bite(Animal a, int hurt) {
	    System.out.println( this.name + " bite " + a.name);
		if(a.weight > hurt) {
		   a.weight -= hurt;
		   System.out.println(a.name + " weight is " + a.weight);
		} else {
		   a.weight = 0;
		   System.out.println(a.name + "is Dead!");
		}
	}
}