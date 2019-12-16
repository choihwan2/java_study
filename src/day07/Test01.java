package day07;

public class Test01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print();
		// is a  관계
		// 모든 객체의 데이터타입은 부모가 될 수 있다. 즉 Animal d = new Dog() 도 가능.
		System.out.println(dog.kind);
		System.out.println(dog.getSuperkind());
	}
}
