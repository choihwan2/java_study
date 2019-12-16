package day08;

public class Test04 {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";

		Person p1 = new Person("홍길동", 22);
		Person p2 = new Person("홍길동", 22);

		System.out.println(msg1.toString());
		System.out.println(msg2.toString());

		System.out.println(p1.toString());
		System.out.println(p2);

		Object obj2 = p1;
		System.out.println(obj2);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(null));
	}

}

class Person {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}
		return super.equals(obj);
	}

}