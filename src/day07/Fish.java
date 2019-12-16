package day07;

public class Fish extends Animal {

	String name;

	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super("물고기");
		this.name = name;
	}
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기!");
	}

	public void print() {
		System.out.printf("[%s, %s]%n", kind, name);
	}

}
