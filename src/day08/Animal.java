package day08;

public abstract class Animal {
	String kind = "동물의 종류";
	
	public Animal() {
		super();
	}
	
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}


	public abstract void breath();
	
	public abstract void heart();
}
