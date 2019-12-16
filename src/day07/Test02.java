package day07;

public class Test02 {
	public static void main(String[] args) {
		Object a = new Animal("응가");
		// ((Animal) a).breath();
//		Animal b = new Animal();
//		b = (Animal) a;
		// System.out.println(b.kind);

		Dog d = new Dog();
		// System.out.println(d.kind);
		Object obj2 = d;
		Animal a3 = (Animal) obj2;
		Dog d3 = (Dog) obj2;
		System.out.println(a3.kind);
		System.out.println(d3.kind);

//		String msgString = "hello java";

		Object obj7 = a;
		if (obj7 instanceof Dog) {
			System.out.println(((Dog) obj7).kind);
		}
		if (obj7 instanceof Animal) {
			System.out.println(((Animal) obj7).kind);
		}
		if (obj7 instanceof String) {
			System.out.println(((String) obj7).toUpperCase());
		}

	}

}
