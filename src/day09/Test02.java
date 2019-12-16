package day09;

public class Test02 {
	public static void main(String[] args) {
		A a = new A("고길동");
		a.print();
		A.B b1 = a.new B();
		b1.print();
		
		A.B b = new A().new B();
		b.print();
		
	}
}

class A {
	String nameString = "홍길동";

	public A() {
	}

	public A(String nameString) {
		super();
		this.nameString = nameString;
	}
	
	void print() {
		System.out.println(nameString.charAt(0)+ "**");
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	class B {

		void print() {
			System.out.println(nameString);
		}
	}
}
