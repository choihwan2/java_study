package Prob5;

public class Employee extends Person {
	private String dept;

	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.printf("이  름 : %s	나이: %-5d부서 :%s%n", this.getName(), this.getAge(), dept);
	}

}
