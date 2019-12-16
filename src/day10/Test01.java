package day10;

public class Test01 {
	public static void main(String[] args) {
		Employee<Integer> hwan = new Employee<Integer>("hwan", 111);
		Employee<String> ho = new Employee<String>("ho", "222");
//		Employee emp3 = new Employee("TT", 230203);
		System.out.println(hwan);
		System.out.println(ho);
//		System.out.println(emp3.number);
	}
}

class Employee<T> {
	String name;
	T number;
	
	
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getNumber() {
		return number;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	
	
}