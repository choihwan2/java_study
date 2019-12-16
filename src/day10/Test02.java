package day10;

public class Test02 {
	public static void main(String[] args) {
//		Employee2<String, String> emp1 = 
//				new Employee2<String, String>("홍길동", "212");
//		System.out.println(emp1);
		
		Employee2<String,Integer> emp2 = new Employee2<String, Integer>("홍길동", 2132312);
		System.out.println(emp2);
		
	}
}

class Employee2<T, P extends Number> {
	T name;
	P number;

	public Employee2(T name, P number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}

}