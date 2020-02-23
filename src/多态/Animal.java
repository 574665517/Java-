package ∂‡Ã¨;
public class Animal {
	int weight;
	String name;
	public Animal() {
		System.out.println("Animal()");
		this.weight = 100;
		this.name = "aaa";
	}
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	
	protected void bite(Animal a) {
	    System.out.println( this.name + " bite " + a.name);
	}
	
	protected void bite(Animal a, int hurt) {
	    System.out.println( this.name + " bite " + a.name);
	}
}
