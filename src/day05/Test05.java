package day05;

public class Test05 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		

		emp1.name = "홍길동";
		emp1.dept = "기술부";
		emp1.age = 32;

		emp2.name = "길동홍";
		emp2.dept = "인사부";
		emp2.age = 41;

		emp1.print();
		emp2.print();

	}
}

class Employee {
	// 클래스 안의 variable + method 멤버애들

	String name;
	String dept;
	int age;

	public void print() {
		System.out.printf("사원의 이름은: %s%n집은: %s%n나이는: %d%n", 
				this.name, this.dept, this.age); //this는 본인의 주소를 가르킨당
		return;
	}
}
